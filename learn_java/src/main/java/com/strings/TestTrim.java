package com.strings;

import java.util.Objects;

/**
 * Created by Wuxiang on 2017/9/14.
 */
public class TestTrim {
    public static void main(String[] args) {
        String aaa = "123  ";
        String bbb = " 1 ";
        String ccc = " ";
        System.out.println(aaa.trim().length()+"   "+aaa.trim());
        System.out.println(bbb.trim().length()+"   "+bbb.trim());
        System.out.println(ccc.trim().length()+"   "+Objects.equals(ccc.trim(), ""));
    }
}
