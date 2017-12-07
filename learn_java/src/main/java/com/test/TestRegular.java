package com.test;

import com.utils.RegularUtil;

/**
 * Created by Wuxiang on 2017/12/7.
 */
public class TestRegular {
    public static void main(String[] args) {
        // 判断字符串中是否全是数字
        System.out.println(RegularUtil.isNumeric("12我3"));
        System.out.println(RegularUtil.isNumeric("123"));


    }
}
