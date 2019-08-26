package com.daniel.utils.Collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Daniel Zhang
 * @createTime 2019/8/22
 * @description
 */
public class queryFunction {

    //int binarySearch(List list, Object key)//对List进行二分查找，返回索引，注意List必须是有序的
    //int max(Collection coll)//根据元素的自然顺序，返回最大的元素。 类比int min(Collection coll)
    //int max(Collection coll, Comparator c)//根据定制排序，返回最大元素，排序规则由Comparatator类控制。类比int min(Collection coll, Comparator c)
    //void fill(List list, Object obj)//用指定的元素代替指定list中的所有元素。
    //int frequency(Collection c, Object o)//统计元素出现次数
    //int indexOfSubList(List list, List target)//统计target在list中第一次出现的索引，找不到则返回-1，类比int lastIndexOfSubList(List source, list target).
    //boolean replaceAll(List list, Object oldVal, Object newVal), 用新元素替换旧元素

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(6);
        arrayList.add(8);
        arrayList.add(4);
        arrayList.add(9);
        arrayList.add(4);
        arrayList.add(1);
        arrayList.add(4);

        Integer max = Collections.max(arrayList);
        System.out.printf("the array max value is %s.\n", max);

        int frequency = Collections.frequency(arrayList, 4);
        System.out.printf("found 4 %s times in the array.\n", frequency);

        Collections.fill(arrayList, 6);
        System.out.println("after array fill 6 :" + arrayList);

    }
}
