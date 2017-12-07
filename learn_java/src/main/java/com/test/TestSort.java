package com.test;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

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
        System.out.println("\n排序前:" + list);

        List<String> list1 = list.stream().filter(Objects::nonNull).collect(Collectors.toList());
        List<String> list2 = list.stream().filter(Objects::isNull).collect(Collectors.toList());

        // 1 排在后面  -1 排在前面  0 相等
        list1.sort((a, b) -> {
            if (getNumber(a) > getNumber(b)) {
                return 1;
            } else if (getNumber(b) > getNumber(a)) {
                return -1;
            }
            return 0;
        });
        list1.addAll(list2);
        System.out.println("排序后:" + list1);
    }

    /**
     * 提取字符串的数字
     * @param s 字符串
     * @return int型的数字
     */
    private static int getNumber(String s) {
        String regEx="[^0-9]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(s);
        return Integer.parseInt(m.replaceAll("").trim());
    }
}
