package com.github.bearcoding.forum.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author YiHui
 * @date 2022/7/6
 */
@Configuration
@ComponentScan("com.github.bearcoding.forum.service")
@MapperScan(basePackages = {
        "com.github.bearcoding.forum.service.article.repository.mapper",
        "com.github.bearcoding.forum.service.user.repository.mapper",
        "com.github.bearcoding.forum.service.comment.repository.mapper",
        "com.github.bearcoding.forum.service.config.repository.mapper",
        "com.github.bearcoding.forum.service.statistics.repository.mapper",
        "com.github.bearcoding.forum.service.notify.repository.mapper",})
public class ServiceAutoConfig {
}
