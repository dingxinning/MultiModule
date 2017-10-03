package TemplateMethod.impl;

import TemplateMethod.AbstractCalculator;

/**
 * Created by Wuxiang on 2017/10/3.
 */
public class Minus extends AbstractCalculator {
    @Override
    public int calculate(int num1, int num2) {
        return num1 - num2;
    }
}
