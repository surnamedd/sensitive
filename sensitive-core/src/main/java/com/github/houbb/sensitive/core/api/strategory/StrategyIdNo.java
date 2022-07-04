package com.github.surnamedd.sensitive.core.api.strategory;

import com.github.surnamedd.heaven.util.lang.ObjectUtil;
import com.github.surnamedd.sensitive.api.IContext;
import com.github.surnamedd.sensitive.api.IStrategy;
import com.github.surnamedd.sensitive.core.util.strategy.SensitiveStrategyUtil;

/**
 * 身份证号脱敏
 * @author binbin.hou
 * @since 0.0.15
 */
public class StrategyIdNo implements IStrategy {

    @Override
    public Object des(Object original, IContext context) {
        return SensitiveStrategyUtil.idNo(ObjectUtil.objectToString(original));
    }

}
