package com.github.bearcoding.forum.service.article.service;

import com.github.bearcoding.forum.api.model.vo.PageListVo;
import com.github.bearcoding.forum.api.model.vo.PageParam;
import com.github.bearcoding.forum.api.model.vo.article.dto.ArticleDTO;

/**
 *
 *
 */
public interface ArticleRecommendService {
    /**
     * 文章关联推荐
     *
     * @param article
     * @param pageParam
     * @return
     */
    PageListVo<ArticleDTO> relatedRecommend(Long article, PageParam pageParam);
}
