package com.github.bearcoding.forum.service.rank.service;

import com.github.bearcoding.forum.api.model.enums.rank.ActivityRankTimeEnum;
import com.github.bearcoding.forum.api.model.vo.rank.dto.RankItemDTO;
import com.github.bearcoding.forum.service.rank.service.model.ActivityScoreBo;

import java.util.List;

/**
 * 用户活跃排行榜
 *
 *
 *
 */
public interface UserActivityRankService {
    /**
     * 添加活跃分
     *
     * @param userId
     * @param activityScore
     */
    void addActivityScore(Long userId, ActivityScoreBo activityScore);

    /**
     * 查询用户的活跃信息
     *
     * @param userId
     * @param time
     * @return
     */
    RankItemDTO queryRankInfo(Long userId, ActivityRankTimeEnum time);

    /**
     * 查询活跃度排行榜
     *
     * @param time
     * @return
     */
    List<RankItemDTO> queryRankList(ActivityRankTimeEnum time, int size);
}
