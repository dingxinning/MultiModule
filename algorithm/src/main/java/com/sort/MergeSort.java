package com.sort;

/**
 * Created by Wuxiang on 2018/3/31
 * <p>
 * 6. 归并排序算法
 *
 * 思想：
 * 假设初始序列含有n个记录,则可以看成n个有序的子序列,每个子序列的长度为1,然后
 * 两两归并,得到(不小于n/2的最小整数)个长度为2或1的有序子序列,再两两归并,...
 * 如此重复,直至得到一个长度为n的有序序列为止,这种排序方法称为2路归并排序
 */
public class MergeSort {

    public static void mergeSort(int[] A) {
        //归并排序，递归做法，分而治之
        mSort(A, 0, A.length - 1);

    }

    private static void mSort(int[] A, int left, int right) {
        //分而治之，递归常用的思想，跳出递归的条件
        if (left >= right) {
            return;
        }
        //中点
        int mid = (left + right) / 2;
        //有点类似后序遍历！
        mSort(A, left, mid);
        mSort(A, mid + 1, right);

        merge(A, left, mid, right);


    }

    //将左右俩组的按序子序列排列成按序序列
    private static void merge(int[] A, int left, int mid, int rightEnd) {
        //充当tem数组的下标
        int record = left;
        //最后复制数组时使用
        int record2 = left;
        //右子序列的开始下标
        int m = mid + 1;
        int[] tem = new int[A.length];

        //只要left>mid或是m>rightEnd，就跳出循环
        while (left <= mid && m <= rightEnd) {

            if (A[left] <= A[m]) {

                tem[record++] = A[left++];
            } else {
                tem[record++] = A[m++];
            }

        }
        while (left <= mid) {
            tem[record++] = A[left++];
        }
        while (m <= rightEnd) {
            tem[record++] = A[m++];
        }
        //复制数组
        for (; record2 <= rightEnd; record2++) {
            A[record2] = tem[record2];
        }

    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 1, 2, 7, 5, 9, 11, 5, 15};

        MergeSort.mergeSort(arr);

        for (int a : arr) {
            System.out.print(a + ", ");
        }
        System.out.println();
    }
}
