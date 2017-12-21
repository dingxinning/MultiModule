package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wuxiang on 2017/12/21.
 *
 * 根据 number 分割字符串
 *
 * 最后一个多的元素的长度在2以内，归到前一个中
 */
public class TestString {
    public static void main(String[] args) {
        int number = 5;
        String string = "12345678901234512";
        List<String> list = new ArrayList<>();

        int startIndex = 0;
        int endIndex = number;
        if (string.length() > 0) {
            for (int i = 0; i < string.length() / number + 1; i++) {
                if (endIndex > string.length()) {
                    endIndex = string.length();
                }

                if (startIndex == endIndex) {
                    break;
                }

                list.add(string.substring(startIndex, endIndex));

                startIndex = endIndex;
                endIndex += number;
            }
        }

        System.out.println(list);

        if (list.size() > 1) {
            if (list.get(list.size() - 1).length() <= 2) {
                list.set(list.size() - 2,
                        list.get(list.size() - 2) +
                                list.get(list.size() - 1));
                list.remove(list.size() - 1);
            }
        }

        System.out.println(list);
    }
}
