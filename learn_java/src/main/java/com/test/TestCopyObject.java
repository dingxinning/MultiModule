package com.test;

/**
 * Created by Wuxiang on 2018/2/2
 */
public class TestCopyObject {
    public static void main(String[] args) {

        CopyEntity test0 = new CopyEntity();
        test0.setAaa("aaa");
        test0.setBbb("bbb");

        CopyEntity test1 = test0;
        CopyEntity test2 = test0;

        test1.setBbb("AAA");
        test2.setAaa("BBB");

        System.out.println(test0);
        System.out.println(test1);
        System.out.println(test2);


        System.out.println("拷贝");

        CopyEntity test00 = new CopyEntity();
        test00.setAaa("aaa");
        test00.setBbb("bbb");

        CopyEntity test3 = (CopyEntity) test00.clone();
        CopyEntity test4 = (CopyEntity) test00.clone();

        test3.setBbb("123");
        test4.setAaa("456");

        System.out.println(test00);
        System.out.println(test3);
        System.out.println(test4);
    }
}
