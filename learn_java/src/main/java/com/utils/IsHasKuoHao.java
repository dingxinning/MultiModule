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
}
