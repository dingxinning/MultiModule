package com.sort;

/**
 * Created by Wuxiang on 2018/3/31
 *
 * 3. 直接插入排序
 *
 * 思想：
 * 将序列中的第一个元素作为一个有序序列，然后将剩余的n-1个元素按关键字大小依次插入该有序序列，
 * 每插入一个元素后依然保持该序列有序
 */
public class InsertionSort {
    public static void insertionSort(int[] A) {
        //用模拟插入扑克牌的思想
        //插入的扑克牌
        int i, j, temp;

        //已经插入一张，继续插入
        for (i = 1; i < A.length; i++) {

            temp = A[i];
            //把i前面所有大于要插入的牌的牌往后移一位，空出一位给新的牌
            for (j = i; j > 0 && A[j - 1] > temp; j--) {
                A[j] = A[j - 1];
            }
            //把空出来的一位填满插入的牌
            A[j] = temp;

        }

    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 1, 2, 7, 5, 9, 11, 5, 15};

        InsertionSort.insertionSort(arr);

        for (int a : arr) {
            System.out.print(a + ", ");
        }
        System.out.println();
    }
}
