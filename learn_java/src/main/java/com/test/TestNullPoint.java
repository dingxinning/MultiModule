package com.test;

/**
 * Created by Wuxiang on 2017/9/11.
 */
public class TestNullPoint {
    public static void main(String[] args) {
        String aaa = null;
        if (aaa!=null && !(aaa.trim().isEmpty())) {
            System.out.println("add");
        }
        System.out.println(123);
    }
}
