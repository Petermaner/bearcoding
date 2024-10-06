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
public class HtmlSourceOption {
    // 地址
    private String url;
    // 内容选择器
    private String contentSelector;
    // 封面图 key
    private String coverImageKey;
    // 标题 key
    private String titleKey;
    // 作者名
    private String authorKey;
    // 昵称
    private String nicknameKey;
    // 类型
    private HtmlSourceType htmlSourceType;
    // keywords
    private String keywordsKey;
    // description
    private String descriptionKey;
    // cookie
    private String cookie;

}
