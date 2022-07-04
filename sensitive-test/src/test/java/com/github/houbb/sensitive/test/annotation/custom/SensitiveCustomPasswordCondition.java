package com.github.surnamedd.sensitive.test.annotation.custom;

import com.github.surnamedd.sensitive.annotation.metadata.SensitiveCondition;
import com.github.surnamedd.sensitive.test.core.condition.ConditionFooPassword;

import java.lang.annotation.*;

/**
 * 自定义密码脱敏策略生效条件
 * @author binbin.hou
 * date 2019/1/17
 * @since 0.0.4
 */
@Inherited
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@SensitiveCondition(ConditionFooPassword.class)
public @interface SensitiveCustomPasswordCondition{
}
