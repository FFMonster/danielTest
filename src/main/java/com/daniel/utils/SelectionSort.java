package com.daniel.utils;

import java.util.Arrays;
import java.util.List;

public class SelectionSort {

    //第一次选出第一小 ; 第二次选出第二小 ; 第三次选出第三小..... 选length次
    private Integer[] selectionSort(Integer[] init) {
        Integer length = init.length;

        for (int i = 0; i < length; i++) {
            Integer mixAddress = i;
            Integer num = init[i];

            for (int j = i; j < length; j++) {
                if (num > init[j]) {
                    mixAddress = j;
                }
            }

            num = init[mixAddress];
            init[mixAddress] = init[i];
            init[i] = num;
        }

        return init;
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        Integer[] init = {37, 58, 96, 10, 21, 18, 67, 80, 33, 75, 24, 71, 48, 12, 95, 77, 86, 99, 73, 60, 93, 50, 84,
                78, 41, 53, 78, 87, 2, 55, 76, 15, 44, 63, 85, 94, 6, 43, 47, 1, 79, 23, 30, 100, 25, 14, 91, 32, 81, 11};
        /*Integer[] init = {5, 3, 4, 1, 2, 10, 8, 11, 55, 21, 9, 7, 22};*/
        List<Integer> result = Arrays.asList(selectionSort.selectionSort(init));
        System.out.println(result);
    }
}
