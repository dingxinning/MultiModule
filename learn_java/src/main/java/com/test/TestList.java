package com.test;

import java.util.ArrayList;
import java.util.Arrays;
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


        List<String> strings = Arrays.asList("1","2","3","4","5","1","2","3","4","5","1","2","3","4","5","1","2","3","4","5","4","5");

        List<List<String>> newStrings = new ArrayList<>();
        if (strings.size() > 7) {
            for (int i = 0; i < strings.size() / 7 + 1; i++) {
                int start = i * 7;
                int end = start + 7;
                if(end > strings.size()){
                    end = strings.size();
                }
                newStrings.add(strings.subList(start, end));
                System.out.println(newStrings);
            }
        }else{
            newStrings.add(strings);
        }
    }
}
