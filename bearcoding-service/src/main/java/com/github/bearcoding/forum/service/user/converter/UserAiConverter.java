package com.github.bearcoding.forum.service.user.converter;

import com.github.bearcoding.forum.api.model.enums.user.StarSourceEnum;
import com.github.bearcoding.forum.api.model.enums.user.UserAIStatEnum;
import com.github.bearcoding.forum.service.user.repository.entity.UserAiDO;
import com.github.bearcoding.forum.service.user.service.help.UserRandomGenHelper;
import org.apache.commons.lang3.StringUtils;

/**
 *
 *
 */
public class UserAiConverter {


    public static UserAiDO initAi(Long userId) {
        return initAi(userId, null);
    }

    public static UserAiDO initAi(Long userId, String starNumber) {
        UserAiDO userAiDO = new UserAiDO();
        userAiDO.setUserId(userId);
        userAiDO.setStarType(0);
        userAiDO.setInviterUserId(0L);
        userAiDO.setStrategy(0);
        userAiDO.setInviteNum(0);
        userAiDO.setDeleted(0);
        userAiDO.setInviteCode(UserRandomGenHelper.genInviteCode(userId));
        if (StringUtils.isBlank(starNumber)) {
            userAiDO.setStarNumber("");
            userAiDO.setState(UserAIStatEnum.IGNORE.getCode());
        } else {
            userAiDO.setStarNumber(starNumber);
            userAiDO.setState(UserAIStatEnum.TRYING.getCode());
            // 先只支持Javaer的星球绑定
            userAiDO.setStarType(StarSourceEnum.JAVA_GUIDE.getSource());
        }
        return userAiDO;
    }

}
