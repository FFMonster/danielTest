package com.daniel.utils;

import java.util.List;

public class TwoNumSum {

    private int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        int length = nums.length;
        judge:
        for (int i = 0; i < length; i++) {
            //第i+1 前面的所有元素已经遍历，确定没有匹配的元素，所以才能运行到这，因此可以跳过这些元素
            for (int j = i + 1; j < length; j++) {
                if (nums[j] == (target - nums[i])) {
                    result[0] = i;
                    result[1] = j;
                    break judge;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        TwoNumSum twoNumSum = new TwoNumSum();
        ArraysToList arraysToList = new ArraysToList();

        int[] nums = new int[]{3, 2, 4};
        int target = 6;

        int[] resArrays = twoNumSum.twoSum(nums, target);

        List<Integer> result = arraysToList.arraysToIntList(resArrays);
        System.out.println(result);

    }
}
