package com.test;

/**
 * Created by Wuxiang on 2017/3/23.
 */
public class TestCompare {
    public static void main(String[] args) {
        String a = "1";
        String b = "30";
        System.out.println(Integer.valueOf(a) > Integer.valueOf(b));

        //a==b  返回0
        //a<b 返回-1
        //a>b 返回1
    }
}
