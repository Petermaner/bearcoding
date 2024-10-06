package com.github.bearcoding.forum.service.config.repository.dao;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.bearcoding.forum.api.model.vo.article.dto.DictCommonDTO;
import com.github.bearcoding.forum.service.config.converter.DictCommonConverter;
import com.github.bearcoding.forum.service.config.repository.entity.DictCommonDO;
import com.github.bearcoding.forum.service.config.repository.mapper.DictCommonMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 *
 */
@Repository
public class DictCommonDao extends ServiceImpl<DictCommonMapper, DictCommonDO> {

    /**
     * 获取所有字典列表
     * @return
     */
    public List<DictCommonDTO> getDictList() {
        List<DictCommonDO> list = lambdaQuery().list();
        return DictCommonConverter.toDTOS(list);
    }
}
