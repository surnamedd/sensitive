package com.github.surnamedd.sensitive.api;

import com.github.surnamedd.deep.copy.api.IDeepCopy;

/**
 * 脱敏配置接口
 * @author binbin.hou
 * @since 0.0.9
 */
public interface ISensitiveConfig {

    /**
     * 深度拷贝
     * @return 深度拷贝
     * @since 0.0.9
     */
    IDeepCopy deepCopy();

}

