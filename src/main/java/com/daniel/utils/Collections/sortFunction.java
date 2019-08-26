package com.daniel.utils.Collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Daniel Zhang
 * @createTime 2019/8/22
 * @description
 */
public class sortFunction {

    //void reverse(List list)//反转
    //void shuffle(List list)//随机排序
    //void sort(List list)//按自然排序的升序排序
    //void sort(List list, Comparator c)//定制排序，由Comparator控制排序逻辑
    //void swap(List list, int i , int j)//交换两个索引位置的元素
    //void rotate(List list, int distance)//旋转。当distance为正数时，将list后distance个元素整体移到前面。当distance为负数时，将 list的前distance个元素整体移到后面。

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(-2);
        arrayList.add(4);
        arrayList.add(10);
        arrayList.add(9);

        System.out.println("init arrayList is " + arrayList);
        Collections.reverse(arrayList);
        System.out.println("reverse arrayList is " + arrayList);
        Collections.shuffle(arrayList);
        System.out.println("shuffle arrayList is " + arrayList);
        Collections.sort(arrayList);
        System.out.println("sort arrayList is " + arrayList);
    }
}
