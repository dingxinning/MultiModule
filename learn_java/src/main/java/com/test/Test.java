package com.test;

import java.util.*;

/**
 * Created by Wuxiang on 2017/11/15.
 */
public class Test {
    public static void main(String[] args) {
        List<Long> times = new ArrayList<>();
        times.add((long) 1510731552);
        times.add((long) 1510341552);
        times.add((long) 1410341552);
        times.add(null);
        times.add(null);
        times.add((long) 1610341552);

        System.out.println(times);

        Collections.sort(times, new Comparator<Long>() {
            @Override
            public int compare(Long a, Long b) {
                if (a == null || b == null) {
                    return 2;
                }
                if(a>b){
                    return 1;
                }else if(a>b){
                    return -1;
                }
                return 0;
            }
        });


        System.out.println(times);

        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        names.forEach(s-> System.out.println("排序前："+s));
        //java8 新用法
        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });
        names.forEach( s -> System.out.println("排序后："+s) );
    }
}
