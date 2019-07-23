package com.daniel.utils;

import java.util.Arrays;
import java.util.List;

public class InsertionSort {

    private Integer[] insertionSort(Integer[] init) {
        Integer length = init.length;

        //function1   my answer
        for (int i = 0; i < length; i++) {

            Integer number = init[i];
            Integer maxAddress = 0;
            boolean compare = false;

            // 拿到这个数应该处于的位置  即 less< num < more ,记录下位置信息
            for (int j = i; j > 0; j--) {
                if (number < init[j - 1]) {
                    maxAddress = j - 1;
                    compare = true;
                }
            }

            if (compare) {
                for (int k = i; k > maxAddress; k--) {
                    Integer tempNum = 0;
                    tempNum = init[k - 1];

                    init[k - 1] = init[k];
                    init[k] = tempNum;
                }
            }
        }


        //function2
        /*for (int i = 0; i < length - 1; i++) {
            Integer tempNum = init[i + 1];
            Integer tempIndex = i;

            while (tempIndex >= 0 && tempNum < init[tempIndex]) {
                init[tempIndex + 1] = tempNum;
                tempIndex--;
            }

            init[i + 1] = tempNum;

        }*/

        return init;
    }


    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();

        /*Integer[] init = {37, 58, 96, 10, 21, 18, 67, 80, 33, 75, 24, 71, 48, 12, 95, 77, 86, 99, 73, 60, 93, 50, 84,
                78, 41, 53, 78, 87, 2, 55, 76, 15, 44, 63, 85, 94, 6, 43, 47, 1, 79, 23, 30, 100, 25, 14, 91, 32, 81, 11};*/

        Integer[] init = {4, 1, 5, 2, 3};

        Integer[] result = insertionSort.insertionSort(init);
        List<Integer> list = Arrays.asList(result);
        System.out.println(list);
    }
}
