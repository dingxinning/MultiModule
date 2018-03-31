package com.sort;

/**
 * Created by Wuxiang on 2018/3/31
 *
 * 8. 桶排序
 * 9. 计数排序算法
 *
 * 【桶排序的步骤】
 * 1. 设置一个定量的数组当作空桶子。
 * 2. 寻访序列，并且把项目一个一个放到对应的桶子去。
 * 3. 对每个不是空的桶子进行排序。
 * 4. 从不是空的桶子里把项目再放回原来的序列中。
 *
 * 计数排序算法（实际上就是桶排序算法）
 */
public class CountingSort {

    private static void countingSort(int[] A) {
        if (A == null || A.length < 2) {
            return ;
        }
        //找出桶的范围,即通过要排序的数组的最大最小值来确定桶范围
        int min = A[0];
        int max = A[0];
        for (int i = 0; i < A.length; i++) {
            min = Math.min(A[i], min);
            max = Math.max(A[i], max);
        }
        //确定桶数组，桶的下标即为需排序数组的值，桶的值为序排序数同一组值出现的次数
        int[] arr = new int[max - min + 1];

        //往桶里分配元素
        for (int i = 0; i < A.length; i++) {
            arr[A[i] - min]++;
        }

        //从桶中取出元素
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i]-- > 0) {
                A[index++] = i + min;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 1, 2, 7, 5, 9, 11, 5, 15};

        CountingSort.countingSort(arr);

        for (int a : arr) {
            System.out.print(a + ", ");
        }
        System.out.println();
    }
}
