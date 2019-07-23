package com.daniel.utils;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {

    // 循环左右比较，第一次选出第一个大的 ; 第二次选出第二个大的.....
    public static Integer[] listBubbleSort(Integer[] originalList) {

        Integer listSize = originalList.length;
        Integer num = 0;

        for (int i = 0; i < listSize; i++) {
            for (int j = 0; j < listSize - i - 1; j++) {
                if (originalList[j] > originalList[j + 1]) {
                    num = originalList[j];
                    originalList[j] = originalList[j + 1];
                    originalList[j + 1] = num;

                }
            }
        }

        return originalList;
    }

    public static void main(String[] args) {
        Integer[] init = {37, 55, 96, 11, 21, 21, 67, 80, 33, 75, 24, 71, 48, 12, 88, 77, 86, 21, 77, 60, 91, 48, 87,
                78, 41, 53, 78, 87, 2, 55, 75, 15, 44, 67, 85, 94, 44, 43, 47, 1, 79, 23, 30, 44, 25, 14, 91, 32, 81, 11};
        List<Integer> result = Arrays.asList(listBubbleSort(init));
        System.out.println(result);
    }
}
