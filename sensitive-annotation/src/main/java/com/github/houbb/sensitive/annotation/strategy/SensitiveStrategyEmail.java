package com.github.surnamedd.sensitive.annotation.strategy;

import com.github.surnamedd.sensitive.annotation.metadata.SensitiveStrategy;
import com.github.surnamedd.sensitive.api.impl.SensitiveStrategyBuiltIn;

import java.lang.annotation.*;

/**
 * 邮箱脱敏注解
 * @author binbin.hou
 * date 2019/1/9
 * @since 0.0.2
 */
@Inherited
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@SensitiveStrategy(SensitiveStrategyBuiltIn.class)
public @interface SensitiveStrategyEmail {
}
