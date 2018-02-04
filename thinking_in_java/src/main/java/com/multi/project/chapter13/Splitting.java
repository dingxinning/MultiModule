package com.multi.project.chapter13;

import java.util.Arrays;

/**
 * Created by Wuxiang on 2018/1/28
 *
 * 13.6.1
 */
public class Splitting {
    public static String knights =
            "Then, when you have found the shrubbery, you must " +
                    "cut down the mightiest tree in the forest... " +
                    "with... a herring!";

    public static void split(String regex) {
        System.out.println(
                Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args) {
        split(" "); // 使用空格截取
        split("\\W+"); // 使用 ‘非单词字符’ 截取  （删除了标点字符）
        split("n\\W+"); // 'n' 后面跟着一个或多个 ‘非单词字符’
    }
}
