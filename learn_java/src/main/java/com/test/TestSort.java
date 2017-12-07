package com.test;

import java.util.*;

/**
 * Created by Wuxiang on 2017/11/15.
 * 测试： 排序 （由小到大  由大到小）
 * 测试： 自定义排序 列表中含有null数据
 */
public class TestSort {
    public static void main(String[] args) {

        // 由小到大 排序
        List<String> dates = Arrays.asList("2017-9-19", "2017-8-1", "2017-6-24", "2017-9-1");
        dates.sort((String a, String b) -> a.compareTo(b));
        dates.sort(String::compareTo);
        dates.forEach(date-> System.out.print(date+", "));

        // 由大到小 排序
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, (String a, String b) -> b.compareTo(a));
        Collections.sort(names, Comparator.reverseOrder());
        names.forEach(name-> System.out.print(name+", "));


        List<String> list = new ArrayList<>();
        list.add("1楼2床");
        list.add(null);
        list.add("5楼4床");
        list.add("2楼5床");
        list.add("3楼1床");
        list.add(null);
        System.out.println(list);


        

//        Collections.sort(list, new Comparator<Long>() {
//            @Override
//            public int compare(Long a, Long b) {
//                if (a == null || b == null) {
//                    return 2;
//                }
//                if(a>b){
//                    return 1;
//                }else if(a>b){
//                    return -1;
//                }
//                return 0;
//            }
//        });
        System.out.println(list);
    }
}
