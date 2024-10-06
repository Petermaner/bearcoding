package com.github.bearcoding.forum.test.mysqlredis;

import com.github.bearcoding.forum.api.model.vo.article.TagReq;
import com.github.bearcoding.forum.api.model.vo.article.dto.TagDTO;
import com.github.bearcoding.forum.service.article.service.TagSettingService;
import com.github.bearcoding.forum.test.BasicTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 *
 */
@Slf4j
public class MysqlRedisService extends BasicTest {

    @Autowired
    private TagSettingService tagSettingService;

    @Test
    public void save() {
        TagReq tagReq = new TagReq();
        tagReq.setTag("Java");
        tagReq.setTagId(1L);
        tagSettingService.saveTag(tagReq);
        log.info("save success:{}", tagReq);
    }

    @Test
    public void query() {
        TagDTO tagDTO = tagSettingService.getTagById(1L);
        log.info("query tagInfo:{}", tagDTO);
    }
}
