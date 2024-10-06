package com.github.bearcoding.forum.api.model.vo.article.dto;

import lombok.Data;

import java.io.Serializable;

/**
 *
 *
 */
@Data
public class TagDTO implements Serializable {
    private static final long serialVersionUID = -8614833588325787479L;

    private Long tagId;

    private String tag;

    private Integer status;

    private Boolean selected;
}
