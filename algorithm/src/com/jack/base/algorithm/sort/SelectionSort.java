package com.jack.base.algorithm.sort;

/**
 * @author: zq
 * @date: 2024-07-29 16:06
 * @Description: 选择排序
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 2, 3, 5, 6, 7, 8, 9, 10};
        selectionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    /**
     * 选择排序
     *
     * @param arr 数组
     */
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        //外循环:未排序区间[i,-1]
        for (int i = 0; i < n - 1; i++) {
            int k = i;
            //内循环：找到未排序区间的最小元素
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[k]) {
                    k = j;
                }
            }
            //将最小元素与未排序区间的首个元素进行交换
            int temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
        }
    }


}
