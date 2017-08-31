package com.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Wuxiang on 2017/1/25.
 */
public class SetTest {
    public static void main(String[] args) {
        Set set = new HashSet();
        String s1=new String("hello");
        String s2=s1;
        String s3=new String("world");
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set.size());  //大小为2   ，去掉重复的元素

    }
}
