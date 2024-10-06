package com.github.bearcoding.forum.service.article.service;

import com.github.bearcoding.forum.api.model.vo.PageVo;
import com.github.bearcoding.forum.api.model.vo.article.SearchTagReq;
import com.github.bearcoding.forum.api.model.vo.article.TagReq;
import com.github.bearcoding.forum.api.model.vo.article.dto.TagDTO;

/**
 * 标签后台接口
 *
 *
 *
 */
public interface TagSettingService {

    void saveTag(TagReq tagReq);

    void deleteTag(Integer tagId);

    void operateTag(Integer tagId, Integer pushStatus);

    /**
     * 获取tag列表
     *
     * @param pageParam
     * @return
     */
    PageVo<TagDTO> getTagList(SearchTagReq req);

    TagDTO getTagById(Long tagId);
}
