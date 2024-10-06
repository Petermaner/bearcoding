package com.github.bearcoding.forum.service.user.service;

import com.github.bearcoding.forum.api.model.enums.user.UserAIStatEnum;
import com.github.bearcoding.forum.api.model.vo.PageVo;
import com.github.bearcoding.forum.api.model.vo.user.SearchZsxqUserReq;
import com.github.bearcoding.forum.api.model.vo.user.ZsxqUserPostReq;
import com.github.bearcoding.forum.api.model.vo.user.dto.ZsxqUserInfoDTO;

import java.util.List;

/**
 *
 *
 *
 *
 */
public interface ZsxqWhiteListService {
    PageVo<ZsxqUserInfoDTO> getList(SearchZsxqUserReq req);

    void operate(Long id, UserAIStatEnum operate);

    void update(ZsxqUserPostReq req);

    void batchOperate(List<Long> ids, UserAIStatEnum operate);

    void reset(Integer authorId);
}
