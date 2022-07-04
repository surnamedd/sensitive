package com.github.surnamedd.sensitive.annotation.metadata;

import com.github.surnamedd.sensitive.api.ICondition;

import java.lang.annotation.*;

/**
 * 用于自定义策略生效条件的注解
 * @since 0.0.4
 * @author binbin.hou
 * date 2019/1/9
 */
@Inherited
@Documented
@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SensitiveCondition {

    /**
     * 策略生效的条件
     * @return 对应的条件实现
     */
    Class<? extends ICondition> value();

}
