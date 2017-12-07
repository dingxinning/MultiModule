package com.java_eight.entity;

import org.springframework.core.convert.converter.Converter;

/**
 * Created by Wuxiang on 2017/12/7.
 */
public class Lambda4 {
    static int outerStaticNum;
    int outerNum;


    void testScopes() {
        Converter<Integer, String> stringConverter1 = (from) -> {
            outerNum = 23;
            return String.valueOf(from);
        };

        Converter<Integer, String> stringConverter2 = (from) -> {
            outerStaticNum = 72;
            return String.valueOf(from);
        };
        System.out.println(stringConverter1+" ,  "+stringConverter2);
    }
}
