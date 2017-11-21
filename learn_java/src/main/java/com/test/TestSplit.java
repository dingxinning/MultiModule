package com.test;

/**
 * Created by Wuxiang on 2017/11/16.
 */
public class TestSplit {
    public static void main(String[] args) {

        String aaa = "base.shanxi.123@V3.010#01";
        System.out.println(getLargeVersion(aaa));
        System.out.println(getSmallVersion(aaa));
        System.out.println(getGroupVersion(aaa));
    }

    private static int getLargeVersion(String code) {
        String s = code.split("@V")[1].split("#")[0].split("\\.")[0];
        return Integer.parseInt(s);
    }

    private static int getSmallVersion(String code) {
        String s = code.split("@V")[1].split("#")[0].split("\\.")[1];
        return Integer.parseInt(s);
    }

    private static int getGroupVersion(String code) {
        String s = code.split("@V")[1].split("#")[1];
        return Integer.parseInt(s);
    }
}
