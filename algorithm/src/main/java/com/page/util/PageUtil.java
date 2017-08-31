package com.page.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Wuxiang on 2017/4/16.
 */
public class PageUtil {
    public static List<Integer> readPageOrientation(String fileString) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileString));
            String string = scanner.nextLine();
            String []s1=string.split(" ");
            for (String aS1 : s1) {
                list.add(Integer.valueOf(aS1));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        scanner.close();
        return list;
    }

    public static void printInfo(List<Integer> list, int n) {
        System.out.print("页面走向：");
        list.forEach(s-> System.out.print(s+" "));
        System.out.println("\n页框数："+n);
    }

    public static void printResult(int a, double b,int c) {
        System.out.println("---------------");
        System.out.println("缺页中断次数："+a);
        System.out.println("系统置换的次数：" + c);
        System.out.println("误码率为："+b);
    }
}
