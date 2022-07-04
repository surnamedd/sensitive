package com.github.surnamedd.sensitive.core.api.strategory;

import com.github.surnamedd.heaven.util.lang.ObjectUtil;
import com.github.surnamedd.sensitive.api.IContext;
import com.github.surnamedd.sensitive.api.IStrategy;
import com.github.surnamedd.sensitive.core.util.strategy.SensitiveStrategyUtil;

/**
 * 银行卡号脱敏：
 * XXXXXX XXXXXXXX XXXX
 * 脱敏规则：123456**********99
 *
 * 只保留前6位和后2位，其他用*代替。
 * @author binbin.hou
 * date 2019/1/2
 */
public class StrategyCardId implements IStrategy {

    @Override
    public Object des(Object original, IContext context) {
        return SensitiveStrategyUtil.cardId(ObjectUtil.objectToString(original));
    }

}
