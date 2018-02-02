package com.test;

/**
 * Created by Wuxiang on 2018/2/2
 *
 * u200B 是ZERO WIDTH SPACE的意思，确实是一种unicode编码。但一般表示为0x200b.
 */
public class Test200B {
    public static void main(String[] args) {
        String a = "我是谁";
        String b = "\u200B\u200B我\u200B是谁\u200B";
        String zerroWidthSpace = "\u200B";

        System.out.println(a);
        System.out.println(b);
        System.out.println(a.equals(b.replaceAll(zerroWidthSpace, "")));
    }
}
