package com.jack.base.algorithm.sort;

/**
 * @author: zq
 * @date: 2024-07-31 16:56
 * @Description: 插入排序
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4};
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    /**
     * 插入排序
     * @param arr arr
     */
    public static void insertionSort(int[] arr) {
       for (int i = 1; i < arr.length; i++) {
           int num = arr[i];
           int j = i - 1;
           while (j >= 0 && arr[j] > num) {
               arr[j + 1] = arr[j];
               j--;
           }
           arr[j + 1] = num;
       }
    }
}
