package com.github.bearcoding.forum.core.util.id.snowflake;

/**
 *
 *
 */
public interface IdGenerator {
    /**
     * 生成分布式id
     *
     * @return
     */
    Long nextId();
}
