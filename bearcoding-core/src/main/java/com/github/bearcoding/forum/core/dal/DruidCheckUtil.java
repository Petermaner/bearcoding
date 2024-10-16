package com.github.bearcoding.forum.core.dal;

import com.github.hui.quick.plugin.qrcode.util.ClassUtils;

/**
 *
 *
 */
public class DruidCheckUtil {

    /**
     * 判断是否包含durid相关的数据包
     *
     * @return
     */
    public static boolean hasDuridPkg() {
        return ClassUtils.isPresent("com.alibaba.druid.pool.DruidDataSource", DataSourceConfig.class.getClassLoader());
    }

}
