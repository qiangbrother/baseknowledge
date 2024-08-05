package com.jack.base.algorithm.search;

/**
 * @author: zq
 * @date: 2024-07-29 10:39
 * @Description: 二分查找
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        System.out.println("index:" + binarySearch(arr, 9));
    }

    /**
     * 二分查找-双闭区间
     * @param arr 数组
     * @param target 目标值
     * @return 元素位置
     */
    public static int binarySearch(int[] arr, int target) {
        //初始化双区间
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            //计算中间索引
            int mid = i + (j - i) / 2;
            if (arr[mid] < target) {
                i = mid + 1;
            } else if (arr[mid] > target) {
                i = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * 二分查找-左闭右开区间
     * @param nums nums
     * @param target target
     * @return 元素位置
     */
    public static int binarySearchLCRO(int[] nums, int target) {
        // 初始化左闭右开区间 [0, n) ，即 i, j 分别指向数组首元素、尾元素+1
        int i = 0, j = nums.length;
        // 循环，当搜索区间为空时跳出（当 i = j 时为空）
        while (i < j) {
            // 计算中点索引 m
            int m = i + (j - i) / 2;
            // 此情况说明 target 在区间 [m+1, j) 中
            if (nums[m] < target) {
                i = m + 1;
            }
                // 此情况说明 target 在区间 [i, m) 中
            else if (nums[m] > target) {
                j = m;
            }
                // 找到目标元素，返回其索引
            else {
                return m;
            }
        }
        // 未找到目标元素，返回 -1
        return -1;
    }

}
