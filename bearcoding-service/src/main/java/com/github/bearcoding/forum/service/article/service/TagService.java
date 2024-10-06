package com.github.bearcoding.forum.service.article.service;

import com.github.bearcoding.forum.api.model.vo.PageParam;
import com.github.bearcoding.forum.api.model.vo.PageVo;
import com.github.bearcoding.forum.api.model.vo.article.dto.TagDTO;

/**
 * 标签Service
 *
 *
 *
 */
public interface TagService {

    PageVo<TagDTO> queryTags(String key, PageParam pageParam);

    Long queryTagId(String tag);
}
