package com.daniel.utils.ValueTransmit;

/*
 * 基本数据类型的传递
 * @param null
 * @return
 * @throws 
 * @date 2019/8/19 15:53
*/
public class CallByValue {

    private static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
        System.out.printf("after change, A vaule is %s. \n", a);
        System.out.printf("after change, B vaule is %s. \n", b);
    }

    public static void main(String[] args) {
        Integer num1 = 10;
        Integer num2 = 20;
        swap(num1, num2);

        System.out.printf("In the main, num1 vaule is %s. \n", num1);
        System.out.printf("In the main, num2 vaule is %s. \n", num2);

        // num1 = 10, 调用swap()时,方法体得到的是 a(num1的拷贝)
        // num2 = 20, 调用swap()时,方法体得到的是 b(num2的拷贝)
        //因此在swap()方法体中，交换的是num1和num2 两个拷贝对象(a和b)的值。 num1和num2的本身是不会发生改变的
    }
}
