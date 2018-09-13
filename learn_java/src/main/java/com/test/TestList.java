package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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


        String id = "f697cbfb2ade465b88b2ba1c2b695d89,1,临时,013879,黄彩嫆,2018-08-20 14:02,013879,黄彩嫆,2018-08-20 14:02,;";
        String[] ids = id.split(";");
        for (int i = 0; i < ids.length; i++) {
            String content[] = ids[i].split(",");
            System.out.println(content.length);
        }


        List<String> inpno = new ArrayList<>();
        inpno.add("123");
        inpno.add("123");
        inpno.add("456");
        inpno.add("789");
        System.out.println(inpno.toString());
        List<String> newInpno = inpno.stream().distinct().map(i -> "'" + i + "'").collect(Collectors.toList());
        System.out.println(String.join(",",newInpno));

    }
}
