package com.sort;

/**
 * Created by Wuxiang on 2018/3/31
 * <p>
 * 7. 快速排序
 *
 * 基本思想：
 * 指定某个元素为分割元素，经过一趟排序后，将序列分成两部分，
 * 低端序列都比分割元素小，高端序列都比分割元素大，
 * 递归对两侧序列进行快排，直到子序列为空或者只有一个时结束
 * 时间复杂度：O(nlog2n)
 */
public class QuickSort {

    public static void quickSort(int[] A) {
        //快速排序
        qSort(A, 0, A.length - 1);

    }

    private static void qSort(int[] A, int left, int right) {

        //枢轴
        int pivot;
        if (left < right) {

            pivot = partition(A, left, right);

            qSort(A, left, pivot - 1);
            qSort(A, pivot + 1, right);

        }

    }

    //优化选取一个枢轴，想尽办法把它放到一个位置，使它左边的值都比它小，右边的值都比它大
    private static int partition(int[] A, int left, int right) {

        //优化选取枢轴，采用三数取中的方法
        int pivotKey = median3(A, left, right);
        //从表的俩边交替向中间扫描
        //枢轴用pivotKey给备份了
        while (left < right) {
            while (left < right && A[right] >= pivotKey) {
                right--;
            }
            //用替换方式，因为枢轴给备份了，多出一个存储空间
            A[left] = A[right];
            while (left < right && A[left] <= pivotKey) {
                left++;
            }
            A[right] = A[left];

        }

        //把枢轴放到它真正的地方
        A[left] = pivotKey;
        return left;
    }

    //三数取中
    private static int median3(int[] A, int left, int right) {

        int mid = (right - left) / 2;
        if (A[left] > A[right]) {
            swap(A, left, right);
        }
        if (A[mid] > A[left]) {
            swap(A, mid, left);
        }
        if (A[mid] > A[right]) {
            swap(A, mid, right);
        }

        return A[left];
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 1, 2, 7, 5, 9, 11, 5, 15};

        QuickSort.quickSort(arr);

        for (int a : arr) {
            System.out.print(a + ", ");
        }
        System.out.println();
    }
}
