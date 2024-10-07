package com.github.bearcoding.forum.web.front.login.wx.helper;

import com.github.bearcoding.forum.api.model.vo.user.wx.BaseWxMsgResVo;
import com.github.bearcoding.forum.api.model.vo.user.wx.WxImgTxtItemVo;
import com.github.bearcoding.forum.api.model.vo.user.wx.WxImgTxtMsgResVo;
import com.github.bearcoding.forum.api.model.vo.user.wx.WxTxtMsgResVo;
import com.github.bearcoding.forum.core.util.CodeGenerateUtil;
import com.github.bearcoding.forum.service.chatai.service.ChatgptService;
import com.github.bearcoding.forum.service.user.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 *
 *
 */
@Slf4j
@Component
public class WxAckHelper {
    @Autowired
    private LoginService sessionService;
    @Autowired
    private WxLoginHelper qrLoginHelper;

    @Autowired
    private ChatgptService chatgptService;

    /**
     * 返回自动响应的文本
     *
     * @return
     */
    public BaseWxMsgResVo buildResponseBody(String eventType, String content, String fromUser) {
        // 返回的文本消息
        String textRes = null;
        // 返回的是图文消息
        List<WxImgTxtItemVo> imgTxtList = null;
        if ("subscribe".equalsIgnoreCase(eventType)) {
            // 订阅
            textRes = "欢迎来到爱婆小屋，一起交流进步吧~";
        }
        // 下面是关键词回复
        else if (chatgptService.inChat(fromUser, content)) {
            try {
                textRes = chatgptService.chat(fromUser, content);
            } catch (Exception e) {
                log.error("Smartbear 访问异常! content: {}", content, e);
                textRes = "Smartbear 出了点小状况，请稍后再试!";
            }
        }
        // 微信公众号登录
        else if (CodeGenerateUtil.isVerifyCode(content)) {
            sessionService.autoRegisterWxUserInfo(fromUser);
            if (qrLoginHelper.login(content)) {
                textRes = "登录成功，开始愉快的智汇之旅吧！";
            } else {
                textRes = "验证码过期了，刷新登录页面重试一下吧";
            }
        } else {
            textRes = "(●'◡'●)这位朋友想问点什么呢？";
        }

        if (textRes != null) {
            WxTxtMsgResVo vo = new WxTxtMsgResVo();
            vo.setContent(textRes);
            return vo;
        } else {
            WxImgTxtMsgResVo vo = new WxImgTxtMsgResVo();
            vo.setArticles(imgTxtList);
            vo.setArticleCount(imgTxtList.size());
            return vo;
        }
    }
}
