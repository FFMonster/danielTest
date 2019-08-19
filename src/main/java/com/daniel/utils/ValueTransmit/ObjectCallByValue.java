package com.daniel.utils.ValueTransmit;

/*
 * 以对象作为参数的传递
 * @param null
 * @return
 * @throws
 * @date 2019/8/19 15:54
 */
public class ObjectCallByValue {
    private static void change(int[] array) {
        array[0] = 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.printf("init array[0] value is %s.\n", arr[0]);  //1
        change(arr);
        System.out.printf("after change, array[0] value is %s.\n", arr[0]); //0

        //array被初始化arr的拷贝也是一个对象的引用, 即  array和arr指向的是同一个数组对象。
        //方法得到的是对象引用(array)的拷贝, 对象引用和其他的拷贝同时引用同一个对象。
        //因此, 当使用对象作为参数进行传递时,外部对引用对象的改变会反映到所对应的对象上, 因此本来的对象也是会发生改变的。
    }
}
