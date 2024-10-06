package com.github.bearcoding.forum.service.config.service;

import com.github.bearcoding.forum.api.model.vo.PageVo;
import com.github.bearcoding.forum.api.model.vo.config.GlobalConfigReq;
import com.github.bearcoding.forum.api.model.vo.config.SearchGlobalConfigReq;
import com.github.bearcoding.forum.api.model.vo.config.dto.GlobalConfigDTO;

/**
 *
 *
 *
 *
 */
public interface GlobalConfigService {
    PageVo<GlobalConfigDTO> getList(SearchGlobalConfigReq req);

    void save(GlobalConfigReq req);

    void delete(Long id);

    /**
     * 添加敏感词白名单
     *
     * @param word
     */
    void addSensitiveWhiteWord(String word);
}
