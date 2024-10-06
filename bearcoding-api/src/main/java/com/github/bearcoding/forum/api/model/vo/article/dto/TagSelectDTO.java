package com.github.bearcoding.forum.api.model.vo.article.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用标签选择
 *
 *
 *
 */
@Data
public class TagSelectDTO implements Serializable {

    /**
     * 类型
     */
    private String selectType;

    /**
     * 描述
     */
    private String selectDesc;

    /**
     * 是否选中
     */
    private Boolean selected;
}
