package com.github.bearcoding.forum.web.front.search.vo;

import com.github.bearcoding.forum.api.model.vo.user.dto.SimpleUserInfoDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 *
 *
 */
@Data
@ApiModel(value="用户信息")
public class SearchUserVo implements Serializable {
    private static final long serialVersionUID = -2989169905031769195L;

    @ApiModelProperty("搜索的关键词")
    private String key;

    @ApiModelProperty("用户列表")
    private List<SimpleUserInfoDTO> items;
}
