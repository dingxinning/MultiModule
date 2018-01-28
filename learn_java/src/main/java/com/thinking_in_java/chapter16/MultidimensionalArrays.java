package com.thinking_in_java.chapter16;

import java.util.Arrays;

/**
 * Created by Wuxiang on 2018/1/28
 *
 * 16.4 多维数组
 */
public class MultidimensionalArrays {
    public static void main(String[] args) {
        // 基本类型
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.deepToString(a));  // 遍历输出多维数组

        // new来分配数组
        int[][][] b = new int[2][3][1];
        System.out.println(Arrays.deepToString(b));

    }
}
