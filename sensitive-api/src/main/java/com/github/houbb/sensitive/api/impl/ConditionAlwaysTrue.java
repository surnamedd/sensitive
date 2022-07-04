package com.github.surnamedd.sensitive.api.impl;

import com.github.surnamedd.sensitive.api.ICondition;
import com.github.surnamedd.sensitive.api.IContext;

/**
 * 一致返回真的条件
 * @author binbin.hou
 * date 2018/12/29
 * @since 0.0.1
 */
public class ConditionAlwaysTrue implements ICondition {
    @Override
    public boolean valid(IContext context) {
        return true;
    }
}
