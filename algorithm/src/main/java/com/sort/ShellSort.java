package com.sort;

/**
 * Created by Wuxiang on 2018/3/31
 *
 * 4. 希尔排序
 *
 * 基本思想：
 * 算法先将要排序的一组数按某个增量d（n/2,n为要排序数的个数）分成若干组，每组中记录的下标相差d.
 * 对每组中全部元素进行直接插入排序，然后再用一个较小的增量（d/2）对它进行分组，
 * 在每组中再进行直接插入排序。
 * 当增量减到1时，进行直接插入排序后，排序完成。
 */
public class ShellSort {

    public static void shellSort(int[] A) {
        //要插入的纸牌
        int temp, j, i;

        //设定增量D,增量D/2逐渐减小
        for (int D = A.length / 2; D >= 1; D = D / 2) {

            //从下标d开始，对d组进行插入排序
            for (j = D; j < A.length; j++) {

                temp = A[j];
                for (i = j; i >= D && A[i - D] > temp; i -= D) {
                    A[i] = A[i - D];
                }

                A[i] = temp;
            }

        }

    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 1, 2, 7, 5, 9, 11, 5, 15};

        ShellSort.shellSort(arr);

        for (int a : arr) {
            System.out.print(a + ", ");
        }
        System.out.println();
    }
}
