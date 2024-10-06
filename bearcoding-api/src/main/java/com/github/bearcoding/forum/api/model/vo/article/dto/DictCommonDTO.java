package com.github.bearcoding.forum.api.model.vo.article.dto;

import lombok.Data;

import java.io.Serializable;

/**
 *
 *
 */
@Data
public class DictCommonDTO implements Serializable {
    private static final long serialVersionUID = -8614833588325787479L;

    private String typeCode;

    private String dictCode;

    private String dictDesc;

    private Integer sortNo;
}
