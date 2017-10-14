package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wuxiang on 2017/5/18.
 */
public class TestList {
    public static void main(String[] args) {

        System.out.println(Math.min(12312,2));

        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("123");
        list.add("123");

        // 尝试清空 list
        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());
    }
}
