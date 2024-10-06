package com.github.bearcoding.forum.web.front.article.vo;

import com.github.bearcoding.forum.api.model.vo.article.dto.ArticleDTO;
import com.github.bearcoding.forum.api.model.vo.article.dto.ArticleOtherDTO;
import com.github.bearcoding.forum.api.model.vo.comment.dto.TopCommentDTO;
import com.github.bearcoding.forum.api.model.vo.recommend.SideBarDTO;
import com.github.bearcoding.forum.api.model.vo.user.dto.UserStatisticInfoDTO;
import lombok.Data;

import java.util.List;

/**
 *
 *
 */
@Data
public class ArticleDetailVo {
    /**
     * 文章信息
     */
    private ArticleDTO article;

    /**
     * 评论信息
     */
    private List<TopCommentDTO> comments;

    /**
     * 热门评论
     */
    private TopCommentDTO hotComment;

    /**
     * 作者相关信息
     */
    private UserStatisticInfoDTO author;
    // 其他的信息，比如说翻页，比如说阅读类型
    private ArticleOtherDTO other;

    /**
     * 侧边栏信息
     */
    private List<SideBarDTO> sideBarItems;

}
