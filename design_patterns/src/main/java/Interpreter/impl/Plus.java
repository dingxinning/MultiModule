package Interpreter.impl;

import Interpreter.Context;
import Interpreter.Expression;

/**
 * Created by Wuxiang on 2017/10/4.
 */
public class Plus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1() + context.getNum2();
    }
}
