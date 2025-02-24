package com.jack.base.algorithm.sort;

/**
 * @author: zq
 * @date: 2024-08-06 10:50
 * @Description: 归并排序
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] nums = {8, 4, 5, 7, 1,9,3,4,2};
        mergeSort(nums, 0, nums.length - 1);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public static void mergeSort(int[] nums, int left, int right) {
        //当数组长度为1时，终止递归
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    /**
     * 合并左子数组和右子数组
     *
     * @param nums  num
     * @param left  left
     * @param mid   mid
     * @param right right
     */
    public static void merge(int[] nums, int left, int mid, int right) {
        //左子数组区间为[left, mid],右子数组区间为[mid + 1, right]
        //创建一个临时数组tmp,用于存放合并后的结果
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;
        //当左右子数组都还有元素时，进行比较并将较小的元素复制到临时数组中
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        //当左子数组还有元素时，将剩余元素复制到临时数组中
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        //当右子数组还有元素时，将剩余元素复制到临时数组中
        while (j <= right) {
            temp[k++] = nums[j++];
        }
        //将临时数组中的元素复制回原数组
        for (int l = 0; l < temp.length; l++) {
            nums[left + l] = temp[l];
        }
    }
}
