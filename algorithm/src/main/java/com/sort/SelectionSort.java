package com.sort;

/**
 * Created by Wuxiang on 2018/3/31
 *
 * 2. 简单选择排序
 *
 * 思想：
 * 通过 n-i 次关键字之间的比较, 从 n-i+1 个记录中选择关键字最小的记录, 并和第i(1<=i<=n)个记录交换之
 */
public class SelectionSort {
    public static void selectionSort(int[] A) {
        //简单选择排序算法,排序结果为递增数组
        //记录最小下标值
        int min;

        //固定左边的数字
        for (int i = 0; i < A.length - 1; i++) {
            min = i;
            //找到下标i开始后面的最小值
            for (int j = i + 1; j < A.length; j++) {

                if (A[min] > A[j]) {
                    min = j;
                }
            }
            //确保稳定排序,数值相等就不用交换
            if (i != min) {
                swap(A, i, min);
            }
        }

    }

    //数组是按引用传递，在函数中改变数组起作用
    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 1, 2, 7, 5, 9, 11, 5, 15};

        SelectionSort.selectionSort(arr);

        for (int a : arr) {
            System.out.print(a + ", ");
        }
        System.out.println();
    }
}
