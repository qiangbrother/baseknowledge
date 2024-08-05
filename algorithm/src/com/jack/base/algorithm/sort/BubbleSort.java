package com.jack.base.algorithm.sort;

import javax.swing.*;

/**
 * @author: zq
 * @date: 2024-07-30 14:37
 * @Description: 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {
/*        int[] arr = {1, 8, 3, 4, 9, 9, 6, 6, 7, 5, 10};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*/
        int[] arr = {1, 4, 2, 3, 9, 9};
        bubbleSortWithFlag(arr);
    }

    /**
     * 冒泡排序
     *
     * @param arr arr
     */
    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 优化冒泡排序，当存在重复的元素的时候，可以减少不必要的比较次数
     *
     * @param arr arr
     */
    public static void bubbleSortWithFlag(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }
}
