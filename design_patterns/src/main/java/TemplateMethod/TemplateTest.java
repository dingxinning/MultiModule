package TemplateMethod;

import TemplateMethod.impl.Plus;

/**
 * Created by Wuxiang on 2017/10/3.
 * 模版方法模式
 *
 * 通过调用抽象类（子类重写抽象类方法），实现对子类的调用
 */
public class TemplateTest {
    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}
