package Interpreter;

import Interpreter.impl.Minus;
import Interpreter.impl.Plus;

/**
 * Created by Wuxiang on 2017/10/4.
 * 解释器模式
 *
 * 一般主要应用在OOP开发中的编译器的开发中，所以适用面比较窄。
 */
public class Test {
    public static void main(String[] args) {
        // 计算9+2-8的值
        int result = new Minus().interpret((new Context(new Plus()
                .interpret(new Context(9, 2)), 8)));
        System.out.println(result);
    }
}
