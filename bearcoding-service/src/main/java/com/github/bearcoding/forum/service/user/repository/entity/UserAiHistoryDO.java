package com.github.bearcoding.forum.service.user.repository.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.github.bearcoding.forum.api.model.entity.BaseDO;
import com.github.bearcoding.forum.api.model.enums.ai.AISourceEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * AI 历史消息表
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("user_ai_history")
public class UserAiHistoryDO extends BaseDO {

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 问题
     */
    private String question;

    /**
     * 答案
     */
    private String answer;

    /**
     * AI 类型
     *
     * @see AISourceEnum#getCode()
     */
    private Integer aiType;

}
