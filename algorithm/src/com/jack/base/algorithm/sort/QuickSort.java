package com.jack.base.algorithm.sort;

/**
 * @author: zq
 * @date: 2024-08-02 15:23
 * @Description: 快速排序
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {1, 8,2, 6,3, 5,  7,  9};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }
    public static int partition(int[] arr, int left, int right) {
        //取最左边元素为基准数
        int i = left, j = right;
        while (i < j) {
            //从右往左找比基准数小的数
            while (i < j && arr[j] >= arr[left]) {
                j--;
            }
            //从左往右找比基准数大的数
            while (i < j && arr[i] <= arr[left]) {
                i++;
            }
            swap(arr, i, j);
        }
        swap(arr, i, left);
        //返回基准数索引
        return i;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
