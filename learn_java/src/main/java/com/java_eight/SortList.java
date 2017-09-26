package com.java_eight;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Wuxiang on 2017/9/19.
 * 两种排序方法
 */
public class SortList {
    public static void main(String[] args) {
        List<String> dates = Arrays.asList("2017-9-19", "2017-8-1", "2017-6-24", "2017-9-1");
        dates.sort((String a, String b)->a.compareTo(b));  // 由小到大 排序
        dates.forEach(date-> System.out.print(date+", "));

        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, (String a, String b) -> b.compareTo(a)); //由大到小 排序
        names.forEach(name-> System.out.print(name+", "));
    }
}
