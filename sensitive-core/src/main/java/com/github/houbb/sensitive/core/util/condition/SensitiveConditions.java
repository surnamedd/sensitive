package com.github.surnamedd.sensitive.core.util.condition;

import com.github.surnamedd.heaven.util.lang.ObjectUtil;
import com.github.surnamedd.heaven.util.lang.reflect.ClassUtil;
import com.github.surnamedd.heaven.util.util.Optional;
import com.github.surnamedd.sensitive.annotation.metadata.SensitiveCondition;
import com.github.surnamedd.sensitive.api.ICondition;

import java.lang.annotation.Annotation;

/**
 * 脱敏条件工具类
 * @author binbin.hou
 * @since 0.0.6
 */
public final class SensitiveConditions {

    private SensitiveConditions(){}

    /**
     * 获取用户自定义条件
     *
     * @param annotations 字段上的注解
     * @return 对应的用户自定义条件
     * @since 0.0.6
     */
    public static Optional<ICondition> getConditionOpt(final Annotation[] annotations) {
        for (Annotation annotation : annotations) {
            SensitiveCondition sensitiveCondition = annotation.annotationType().getAnnotation(SensitiveCondition.class);
            if (ObjectUtil.isNotNull(sensitiveCondition)) {
                Class<? extends ICondition> customClass = sensitiveCondition.value();
                ICondition condition =  ClassUtil.newInstance(customClass);
                return Optional.ofNullable(condition);
            }
        }
        return Optional.empty();
    }

}
