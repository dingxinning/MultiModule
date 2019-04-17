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
//        testClear();
//        testDistinct();
//        testSplit();
//        testChange();
//        testSubListGroup();
        testSubList();
    }

    private static void testClear() {
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("123");
        list.add("123");

        // 尝试清空 list
        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());
    }

    private static void testDistinct() {
        List<String> inpno = new ArrayList<>();
        inpno.add("123");
        inpno.add("123");
        inpno.add("456");
        inpno.add("789");
        System.out.println(inpno.toString());
        List<String> newInpno = inpno.stream().distinct().map(i -> "'" + i + "'").collect(Collectors.toList());
        System.out.println(String.join(",",newInpno));
    }

    private static void testSplit() {
        String id = "f697cbfb2ade465b88b2ba1c2b695d89,1,临时,013879,黄彩嫆,2018-08-20 14:02,013879,黄彩嫆,2018-08-20 14:02,;";
        String[] ids = id.split(";");
        for (int i = 0; i < ids.length; i++) {
            String content[] = ids[i].split(",");
            System.out.println(content.length);
        }

        String test = "C823956E65E00001A23F42801BC81BCA,C82395AD30D000012DB614151FE51C2E";
        String[] rcpid = test.split(",");
        String rcpids = String.join(",", Arrays.stream(rcpid).map(i -> "'" + i + "'").collect(Collectors.toList()));
        System.out.println(rcpids);
    }

    private static void testChange() {
        // List 转 String[]
        List<String> itemTypes = Arrays.asList("2");
        List<String> itemCategorys = Arrays.asList("1", "2", "3", "4");
        String[] arr1 = itemTypes.toArray(new String[0]);
        String[] arr2 = itemCategorys.toArray(new String[0]);
        System.out.println(arr1.length);
        System.out.println(arr2.length);
    }

    private static void testSubListGroup(){
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


    private static void testSubList() {

        // asList的返回对象是一个Arrays内部类, 并没有实现集合的修改方法，返回一个受指定数组支持的固定大小的列表
        // 通过 new ArrayList<>(  ); 包裹，使得数组可变

        // subList() 方法，返回的子数组，修改子数组会影响原数组
        // 通过 new ArrayList<>(  ); 包裹，使得子数组的改变不影响原数组

        List<String> orign = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8");
//        orign.add("add"); // Throw java.lang.UnsupportedOperationException
        System.out.println(orign);

        List<String> orign1 = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8"));
        List<String> target1 = orign1.subList(4, 7);
        target1.add("add1");
        System.out.println(orign1);
        System.out.println(target1);

        List<String> orign2 = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8"));
        List<String> target2 = new ArrayList<>(orign2.subList(4, 7));
        target2.add("add1");
        System.out.println(orign2);
        System.out.println(target2);

    }
}
