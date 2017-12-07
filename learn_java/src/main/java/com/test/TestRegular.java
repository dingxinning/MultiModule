package com.test;

import com.utils.RegularUtil;

/**
 * Created by Wuxiang on 2017/12/7.
 * 测试 正则表达式 工具类
 */
public class TestRegular {
    public static void main(String[] args) {
        // 判断字符串中是否全是数字
        System.out.println(RegularUtil.isNumeric("12我3"));
        System.out.println(RegularUtil.isNumeric("123"));

        // 匹配英文括号里面的内容
        System.out.println(RegularUtil.enBrackets("青霉素(+)(-)（+）（-）"));
        System.out.println(RegularUtil.enBrackets("青霉素(-)(+)（+）（-）"));
        // 匹配中文括号里面的内容
        System.out.println(RegularUtil.cnBrackets("青霉素(+)(-)（+）（-）"));
        System.out.println(RegularUtil.cnBrackets("青霉素(+)(-)（-）（+）"));

    }
}
