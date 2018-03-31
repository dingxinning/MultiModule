package com.sort;

/**
 * Created by Wuxiang on 2018/3/31
 *
 * 1. 冒泡排序
 *
 * 思想：两两比较相邻记录的关键字,如果反序则交换
 *
 * 优化：
 * 并加一个标志位，当某一趟冒泡排序没有元素交换时，则冒泡结束，元素已经有序，可以有效的减少冒泡次数。
 */
public class BubbleSort {
    public static void bubbleSort(int[] A) {
        //冒泡排序：从后往前（从下往上）就像冒泡一样
        //用flag作为标记，标记数组是否已经排序完成
        boolean flag = true;

        //固定左边的数字
        for (int i = 0; i < A.length - 1 & flag; i++) {
            flag = false;
            //从后面（下面）往前（上）遍历
            for (int j = A.length - 2; j >= i; j--) {

                if (A[j] > A[j + 1]) {
                    swap(A, j, j + 1);
                    flag = true;
                }
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

        BubbleSort.bubbleSort(arr);

        for (int a : arr) {
            System.out.print(a + ", ");
        }
        System.out.println();
    }
}
