package com.jvm;

/**
 * Created by Wuxiang on 2018/1/1
 * 测试 语法糖
 *
 * == 和 equals 的关系
 * ==常用于比较原生类型，而equals()方法用于检查对象的相等性。
 */
public class TestSyntaxSugar {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        System.out.println(c == d);          // true
        System.out.println(e == f);          // false  ？不懂
        System.out.println(c == (a + b));    // true
        System.out.println(c.equals(a + b)); // true
        System.out.println(g == (a + b));    // true
        System.out.println(g.equals(a + b)); // false
    }
}
