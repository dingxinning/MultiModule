package com.test;

/**
 * Created by Wuxiang on 2017/11/16.
 * 测试 String.split()
 */
public class TestSplit {
    public static void main(String[] args) {

        String aaa = "base.ttt.123@V3.010#01";
        System.out.println(getLargeVersion(aaa));
        System.out.println(getSmallVersion(aaa));
        System.out.println(getGroupVersion(aaa));

        System.out.println("青霉素(+)".split("\\(")[0] + "&" + "青霉素(+)".split("\\(")[1].split("\\)")[0]);

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
