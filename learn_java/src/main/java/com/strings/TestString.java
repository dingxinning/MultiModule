package com.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wuxiang on 2017/12/21.
 *
 * 根据 number 分割字符串
 *
 * 基础功能：根据字符串的长度，进行截取
 *
 * 升级版功能：  根据中文和英文长度的不同，进行截取，
 *              而不是之前简单的根据字符个数进行截取
 */
public class TestString {
    public static void main(String[] args) {
        int maxLength = 13;  // 一行最大能容纳的 字符个数 （中文）
        int beyondLength = 1; // 最后一行必须超过的字符数

        String string = "19小时总入量为2200ml，其中输液量为1900ml，输血量为300ml。19小时总出量为3100ml，均为尿量。";

        int totalSize = string.length();
        int totalLength = getLength(string);
        int totalMax = 2 * maxLength;

        List<String> list = new ArrayList<>();
        int startIndex = 0;
        int endIndex = 1;

        if (totalSize > 0) {
            for (int i = 0; i < totalLength / totalMax + 1; i++) {

                if (endIndex > totalSize) {
                    endIndex = totalSize;
                }
                if (startIndex == endIndex) {
                    break;
                }

                for (int j = 0; j < totalMax; j++) {
                    String subStr = string.substring(startIndex, endIndex);
                    // 防止越界，最后一列进行处理，并将最后一段也添加到list中
                    if (endIndex == totalSize) {
                        list.add(subStr);
                        break;
                    }

                    // 每段最后，不是英文字符，就是中文字符
                    if (getLength(subStr) == totalMax || getLength(subStr) == totalMax + 1) {
                        list.add(subStr);
                        break;
                    }else{
                        endIndex ++;
                    }
                }

                startIndex = endIndex;
                endIndex += 1;
            }
        }


        if (list.size() > 1) {
            if (list.get(list.size() - 1).length() <= beyondLength) {
                list.set(list.size() - 2,
                        list.get(list.size() - 2) +
                                list.get(list.size() - 1));
                list.remove(list.size() - 1);
            }
        }

        list.forEach(s -> {
            System.out.println("#" + s + "#");
        });
    }

    // 计算字符串的长度，中文算两个，英文算一个
    public static int getLength(String string) {
        int len = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) > 127 || string.charAt(i) == 94) {
                len += 2;
            } else {
                len++;
            }
        }
        return len;
    }

    // 获取unicode编码  类似于 javascript中的 charCodeAt
    public static Integer getUnicode(char c){
        String returnUniCode;
        returnUniCode=String.valueOf((int)c);
        return Integer.parseInt(returnUniCode);
    }
}
