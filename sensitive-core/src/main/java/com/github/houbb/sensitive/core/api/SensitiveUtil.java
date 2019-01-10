package com.github.houbb.sensitive.core.api;

import com.github.houbb.sensitive.api.ISensitive;

/**
 * 脱敏工具类
 * @author binbin.hou
 * date 2018/12/29
 * @since 0.0.1
 */
public final class SensitiveUtil {

    private static final ISensitive SINGLETON = new SensitiveService();

    /**
     * 脱敏对象
     * @param object 原始对象
     * @param <T> 泛型
     * @return 脱敏后的对象
     */
    @SuppressWarnings({"unchecked", "rawtypes"})
    public static <T> T desCopy(T object) {
        return (T) SINGLETON.desCopy(object);
    }

}
