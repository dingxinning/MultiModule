package com.sort;

/**
 * Created by Wuxiang on 2018/3/31
 *
 * 5. 堆排序
 *
 * 概念：
 * 1.堆是完全二叉树
 * 2.大顶堆：每个结点的值都大于或等于其左右孩子结点的值，称为大顶堆。
 * 3.小顶堆：每个结点的值都小于或等于其左右孩子结点的值，称为小顶堆。
 *
 * 基本思想:
 * 将待排序的序列构造成一个大顶堆.此时,整个序列的最大值就是堆顶的根结点.
 * 将它移走(其实就是将其与堆数组的末尾元素交换, 此时末尾元素就是最大值),然后将剩余的n-1个序列重新
 * 构造成一个堆,这样就会得到n个元素的次大值.如此反复执行,便能得到一个有序序列了
 */
public class HeapSort {
    public static void heapSort(int[] A) {

        int i;
        //先把A[]数组构建成一个大顶堆。
        //从完全二叉树的最下层最右边的非终端结点开始构建。
        for (i = A.length / 2 - 1; i >= 0; i--) {
            HeapAdjust(A, i, A.length);
        }

        //开始遍历
        for (i = A.length - 1; i > 0; i--) {
            swap(A, 0, i);
            //每交换一次得到一个最大值然后丢弃
            HeapAdjust(A, 0, i);
        }

    }

    // A[i]代表的是下标为i的根结点
    private static void HeapAdjust(int[] A, int i, int n) {
        //【注意】这里下标从0开始
        int temp;
        //存储根结点
        temp = A[i];
        //沿根结点的左右孩子中较大的往下遍历,由于完全二叉树特性 i的左子节点2i+1  i的右子节点2i+2
        for (int j = 2 * i + 1; j < n; j = j * 2 + 1) {

            if (j < n - 1 && A[j] < A[j + 1]) {
                ++j;
            }

            if (temp >= A[j]) {
                break;
            }
            //将子节点赋值给根结点
            A[i] = A[j];
            //将子节点下标赋给i
            i = j;
        }
        //将存储的根结点的值赋给子节点
        A[i] = temp;

    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;

    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 1, 2, 7, 5, 9, 11, 5, 15};

        HeapSort.heapSort(arr);

        for (int a : arr) {
            System.out.print(a + ", ");
        }
        System.out.println();
    }
}
