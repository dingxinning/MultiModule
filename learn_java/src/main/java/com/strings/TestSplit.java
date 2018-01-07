package com.strings;

import com.utils.RegularUtil;

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

        String name1 = "XX[2017-10-01][2]";
        String name2 = "XX[2017-10-01]";

        System.out.println(countChar(name1, '[') + "   " + getName1(name1));
        System.out.println(countChar(name2, '[') + "   " + getName2(name2));

        System.out.println(getDate(name1) + "  " + getDate(name2));

        String name3 = "XXX3";
        System.out.println(spliceDate(name3, "2013-10-01"));

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

    /**
     * 计算字符串中包含字符个数
     * @param str
     * @param ch
     * @return 匹配的个数
     */
    private static int countChar(String str, char ch) {
        char[] chs = str.toCharArray();
        int count = 0;
        for (char ch1 : chs) {
            if (ch1 == ch) {
                count++;
            }
        }
        return count;
    }

    private static String getName1(String string) {
        String temp = string.split("]\\[")[1];
        String time = temp.substring(0, temp.indexOf(']'));
        return string.substring(0, string.indexOf('[')) + time;
    }

    private static String getName2(String string) {
        return string.substring(0, string.indexOf('['));
    }

    /**
     * 转换名称
     * @param name eg XXX3
     * @param date 日期
     * @return XXX[日期][3]
     */
    private static String spliceDate(String name, String date) {
        int time = RegularUtil.getNumber(name);
        String trueName = name.substring(0, name.indexOf(time + ""));
        return trueName + "[" + date + "][" + time + "]";
    }

    private static String getDate(String name) {
        return name.substring(name.indexOf("[") + 1, name.indexOf("]"));
    }
}
