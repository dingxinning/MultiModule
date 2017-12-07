package com.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Wuxiang on 2017/12/7.
 * 利用Java 正则表达式，使用的工具
 */
public class RegularUtil {

    /**
     * 提取字符串的数字
     * @param s 字符串
     * @return int型的数字
     */
    public static int getNumber(String s) {
        String regEx="[^0-9]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(s);
        return Integer.parseInt(m.replaceAll("").trim());
    }
}
