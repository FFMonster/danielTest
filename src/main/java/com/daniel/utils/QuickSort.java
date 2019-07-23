package com.daniel.utils;

import java.util.Arrays;
import java.util.List;

public class QuickSort {

    private Integer[] quickSort(int[] init) {

        Integer length = init.length;
        int[] result = QuickSort(init, 1, length);

        if (result == null) {
            return null;
        }
        return arraysTranslate(result);
    }


    /**
     * 快速排序方法
     *
     * @param array 数组
     * @param start 开始位置
     * @param end   结束位置
     * @return int[]
     */
    private static int[] QuickSort(int[] array, int start, int end) {
        if (array.length < 1 || start < 0 || end >= array.length || start > end) {
            return null;
        }
        int smallIndex = partition(array, start, end);
        if (smallIndex > start) {
            QuickSort(array, start, smallIndex - 1);
        }
        if (smallIndex < end) {
            QuickSort(array, smallIndex + 1, end);
        }
        return array;
    }

    /**
     * 快速排序算法——partition
     *
     * @param array 数组
     * @param start 开始位置
     * @param end   结束位置
     * @return int
     */
    private static int partition(int[] array, int start, int end) {
        int pivot = (int) (start + Math.random() * (end - start + 1));
        int smallIndex = start - 1;
        swap(array, pivot, end);
        for (int i = start; i <= end; i++) {
            if (array[i] <= array[end]) {
                smallIndex++;
                if (i > smallIndex) {
                    swap(array, i, smallIndex);
                }
            }
        }
        return smallIndex;
    }

    /**
     * 交换数组内两个元素
     *
     * @param array 交换的数组
     * @param i     位置一
     * @param j     位置二
     */
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * 将 int数组 转为 Integer数组
     *
     * @param intArrays int数组
     * @return java.lang.Integer[]
     * @date 2019/7/18 15:36
     */
    private Integer[] arraysTranslate(int[] intArrays) {
        int length = intArrays.length;

        if (length <= 0) {
            return null;
        }

        Integer[] result = new Integer[length];
        for (int i = 0; i < length; i++) {
            result[i] = intArrays[i];
        }

        return result;
    }


    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();

        /*Integer[] init = {37, 58, 96, 10, 21, 18, 67, 80, 33, 75, 24, 71, 48, 12, 95, 77, 86, 99, 73, 60, 93, 50, 84,
                78, 41, 53, 78, 87, 2, 55, 76, 15, 44, 63, 85, 94, 6, 43, 47, 1, 79, 23, 30, 100, 25, 14, 91, 32, 81, 11};*/

        int[] init = {4, 1, 5, 2, 3};

        Integer[] result = quickSort.quickSort(init);
        List<Integer> list = Arrays.asList(result);
        System.out.println(list);
    }
}
