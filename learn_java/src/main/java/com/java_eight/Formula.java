package com.java_eight;

/**
 * Created by Wuxiang on 2017/12/7.
 */
public interface Formula {
    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
