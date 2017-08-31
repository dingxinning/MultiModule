package com.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wuxiang on 2017/5/18.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Math.min(12312,2));

        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("123");
        list.add("123");

        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());
    }
}
