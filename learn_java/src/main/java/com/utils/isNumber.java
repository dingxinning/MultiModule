package com.utils;

import java.util.regex.Pattern;

/**
 * Created by Wuxiang on 2017/8/18.
 *
 * 判断字符串中是否全是数字
 */
public class isNumber {
    public static void main(String[] args) {
        System.out.println(isNumeric("12我3"));
        System.out.println(isNumeric("123"));
    }

    public static boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }
}
