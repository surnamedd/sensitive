package com.github.surnamedd.sensitive.test.core.custom;

import com.github.surnamedd.sensitive.api.IContext;
import com.github.surnamedd.sensitive.api.IStrategy;

/**
 * @author binbin.hou
 * date 2019/1/17
 * @since 0.0.4
 */
public class CustomPasswordStrategy implements IStrategy {

    @Override
    public Object des(Object original, IContext context) {
        return "**********************";
    }

}
