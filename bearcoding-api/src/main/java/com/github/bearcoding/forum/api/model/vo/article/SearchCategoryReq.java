package com.github.bearcoding.forum.api.model.vo.article;

import lombok.Data;

/**
 *
 *
 *
 *
 */
@Data
public class SearchCategoryReq {
    // 类目名称
    private String category;
    // 分页
    private Long pageNumber;
    private Long pageSize;

}
