package com.github.bearcoding.forum.api.model.vo.article.dto;

import lombok.Data;

/**
 *
 *
 *
 *
 */
@Data
public class ColumnArticleFlipDTO {
    String prevHref;
    Boolean prevShow;
    String nextHref;
    Boolean nextShow;
}
