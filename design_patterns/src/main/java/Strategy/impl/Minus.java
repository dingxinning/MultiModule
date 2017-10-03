package Strategy.impl;

import Strategy.AbstractCalculator;
import Strategy.ICalculator;

/**
 * Created by Wuxiang on 2017/10/3.
 */
public class Minus extends AbstractCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"-");
        return arrayInt[0]-arrayInt[1];
    }
}
