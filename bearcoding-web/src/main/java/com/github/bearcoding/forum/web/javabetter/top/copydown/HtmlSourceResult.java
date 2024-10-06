package com.github.bearcoding.forum.web.javabetter.top.copydown;

import lombok.Builder;
import lombok.Data;

/**
 *
 *
 *
 *
 */
@Data
@Builder
public class HtmlSourceResult {

    // 封面图路径
    private String cover;
    // 标题
    private String title;
    // 作者名
    private String author;
    // 原文链接
    private String sourceLink;
    // MD 内容
    private String markdown;
    // keywords
    private String keywords;
    // description
    private String description;
    private HtmlSourceType htmlSourceType;
    // 文件目录
    private String fileDir;
    // 图片目录
    private String imgDest;
}
