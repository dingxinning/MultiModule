package com.test;

import com.alibaba.fastjson.JSON;

/**
 * Created by Wuxiang on 2018/2/7
 *
 * 测试 字符串是否能  反序列化
 */
public class TestJson {
    public static void main(String[] args) {
        String s = "{'x':'23'}";
        System.out.println(isJson(s));

        System.out.println(isJson("11"));
    }

    public static boolean isJson(String string){
        try {
            JSON.parse(string);
            return string.indexOf('{') > -1;
        }catch (Exception e){
            return false;
        }
    }
}
