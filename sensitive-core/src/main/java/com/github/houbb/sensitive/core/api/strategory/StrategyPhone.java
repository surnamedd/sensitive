package com.github.surnamedd.sensitive.core.api.strategory;

import com.github.surnamedd.heaven.util.lang.ObjectUtil;
import com.github.surnamedd.sensitive.api.IContext;
import com.github.surnamedd.sensitive.api.IStrategy;
import com.github.surnamedd.sensitive.core.util.strategy.SensitiveStrategyUtil;

/**
 * 手机号脱敏
 * 脱敏规则：139****6631
 *
 * @author binbin.hou
 * date 2019/1/2
 */
public class StrategyPhone implements IStrategy {

    @Override
    public Object des(Object original, IContext context) {
        return SensitiveStrategyUtil.phone(ObjectUtil.objectToString(original));
    }

}
