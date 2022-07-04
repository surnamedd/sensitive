package com.github.surnamedd.sensitive.test.annotation;

import com.github.surnamedd.sensitive.annotation.metadata.SensitiveStrategy;
import com.github.surnamedd.sensitive.api.impl.SensitiveStrategyBuiltIn;

import java.lang.annotation.*;

/**
 * 模拟用户使用禁止使用的 SensitiveStrategyBuiltIn 来声明策略
 * @author binbin.hou
 * date 2019/1/15
 * @since 0.0.3
 */
@Inherited
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@SensitiveStrategy(SensitiveStrategyBuiltIn.class)
public @interface SensitiveErrorSystemBuiltIn {
}
