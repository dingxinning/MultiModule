package com.test;

import com.utils.RegularUtil;

/**
 * Created by Wuxiang on 2017/12/7.
 * 测试各种包装类
 */
public class TestPackagingClass {
    public static void main(String[] args) {
        Integer integer = 37;
//        System.out.println((Double) integer);  // Java.lang.Integer cannot be cast to java.lang.Double
        System.out.println(Double.valueOf(integer.toString()));
        System.out.println(RegularUtil.string2Integer(integer.toString()));

        Double dou = 37.5;
//        System.out.println((Integer)dou);  // Java.lang.Double cannot be cast to java.lang.Integer
        System.out.println(RegularUtil.string2Integer(dou.toString()));
        System.out.println(Double.valueOf(dou.toString()));

        System.out.println(Integer.valueOf("123"));
        System.out.println(Integer.parseInt("123"));

    }
}
