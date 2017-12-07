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

    /**
     * 判断String中是否全是数字
     * @param str
     * @return
     */
    public static boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }

    /**
     * 匹配字符串中 英文括号里面包裹的内容
     * @param str
     * @return 第一对括号里的内容
     */
    public static String enBrackets(String str){
        Pattern pattern = Pattern.compile("(?<=\\()[^\\)]+");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()){
            return matcher.group();
        }
        return null;
    }

    /**
     * 匹配字符串中 中文括号里面包裹的内容
     * @param str
     * @return 第一对括号里的内容
     */
    public static String cnBrackets(String str){
        Pattern pattern = Pattern.compile("(?<=（)[^）]+");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()){
            return matcher.group();
        }
        return null;
    }

    /**
     * 字符串 转 Integer
     * 强行使用 Integer.parseInt，抛异常 java.lang.NumberFormatException
     * @param string 字符串中含有 .
     * @return
     */
    public static Integer string2Integer(String string){
        Pattern pattern = Pattern.compile("\\.");
        Matcher matcher = pattern.matcher(string);
        if(matcher.find()){
            String str = string.substring(0, string.indexOf("."));
            return Integer.parseInt(str);
        }else {
            return Integer.parseInt(string);
        }
    }
}
