package com.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Wuxiang on 2017/9/3.
 *
 * 匹配括号 （中文与英文） 里面的内容
 */
public class IsHasKuoHao {
    public static void main(String[] args) {
        System.out.println(enBrackets("青霉素(+)(-)（+）（-）"));
        System.out.println(enBrackets("青霉素(-)(+)（+）（-）"));
        System.out.println(cnBrackets("青霉素(+)(-)（+）（-）"));
        System.out.println(cnBrackets("青霉素(+)(-)（-）（+）"));

        System.out.println("青霉素(+)".split("\\(")[0]);
        System.out.println("(+)".split("\\(")[0] + "   " + "(+)".split("\\(")[1]);

        Integer integer = 37;
//        System.out.println((Double) integer);  // Java.lang.Integer cannot be cast to java.lang.Double
        System.out.println(string2Double(integer.toString()));
        System.out.println(string2Integer(integer.toString()));

        Double dou = 37.5;
//        System.out.println((Integer)dou);  // Java.lang.Double cannot be cast to java.lang.Integer
        System.out.println(string2Integer(dou.toString()));
        System.out.println(string2Double(dou.toString()));

    }

    public static String enBrackets(String str){
        Pattern pattern = Pattern.compile("(?<=\\()[^\\)]+");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()){
            return matcher.group();
        }
        return null;
    }

    public static String cnBrackets(String str){
        Pattern pattern = Pattern.compile("(?<=（)[^）]+");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()){
            return matcher.group();
        }
        return null;
    }

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

    public static Double string2Double(String string) {
        return Double.valueOf(string);
    }
}
