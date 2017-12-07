package com.test;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wuxiang on 2017/12/7.
 *
 * java端，使用subList 进行分页
 */
public class ListPaging {
    public static List<List<Integer>> page(List<Integer> list, int pageSize) {
        int totalCount = list.size();
        int pageCount;
        int m = totalCount % pageSize;

        if (m > 0) {
            pageCount = totalCount / pageSize + 1;
        } else {
            pageCount = totalCount / pageSize;
        }

        List<List<Integer>> totalList = new ArrayList<>();
        for (int i = 1; i <= pageCount; i++) {
            if (m == 0) {
                List<Integer> subList = list.subList((i - 1) * pageSize, pageSize * (i));
                totalList.add(subList);
            } else {
                if (i == pageCount) {
                    List<Integer> subList = list.subList((i - 1) * pageSize, totalCount);
                    totalList.add(subList);
                } else {
                    List<Integer> subList = list.subList((i - 1) * pageSize, pageSize * i);
                    totalList.add(subList);
                }
            }
        }

        return totalList;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 52; i++) {
            list.add(i);
        }

        int pageSize = 10;
        int pageNo = 2;

        List<List<Integer>> totalList = page(list, pageSize);
        System.out.println(totalList.get(pageNo - 1));
    }
}
