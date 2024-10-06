package com.github.bearcoding.forum.web.front.rank;

import com.github.bearcoding.forum.api.model.enums.rank.ActivityRankTimeEnum;
import com.github.bearcoding.forum.api.model.vo.ResVo;
import com.github.bearcoding.forum.api.model.vo.rank.dto.RankInfoDTO;
import com.github.bearcoding.forum.api.model.vo.rank.dto.RankItemDTO;
import com.github.bearcoding.forum.service.rank.service.UserActivityRankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 排行榜
 *
 * @author YiHui
 * @date 2023/8/20
 */
@Controller
public class RankController {
    @Autowired
    private UserActivityRankService userActivityRankService;

    /**
     * 活跃用户排行榜
     *
     * @param time
     * @param model
     * @return
     */
    @RequestMapping(path = "/rank/{time}")
    public String rank(@PathVariable(value = "time") String time, Model model) {
        ActivityRankTimeEnum rankTime = ActivityRankTimeEnum.nameOf(time);
        if (rankTime == null) {
            rankTime = ActivityRankTimeEnum.MONTH;
        }
        List<RankItemDTO> list = userActivityRankService.queryRankList(rankTime, 30);
        RankInfoDTO info = new RankInfoDTO();
        info.setItems(list);
        info.setTime(rankTime);
        ResVo<RankInfoDTO> vo = ResVo.ok(info);
        model.addAttribute("vo", vo);
        return "views/rank/index";
    }
}
