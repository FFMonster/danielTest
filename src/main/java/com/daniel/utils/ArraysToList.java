package com.daniel.utils;

import java.util.ArrayList;
import java.util.List;

public class ArraysToList {

    public List<Integer> arraysToIntList(int[] nums) {
        int length = nums.length;
        if (length <= 0) {
            return null;
        }
        List<Integer> reuslt = new ArrayList<>();

        for (int num : nums) {
            reuslt.add(num);
        }
        return reuslt;
    }
}
