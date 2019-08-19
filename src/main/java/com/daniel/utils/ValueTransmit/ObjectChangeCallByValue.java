package com.daniel.utils.ValueTransmit;

import com.daniel.entity.Customer;

public class ObjectChangeCallByValue {

    private static void swap(Customer x, Customer y) {
        Customer temp = x;
        x = y;
        y = temp;

        System.out.printf("x : %s.\n", x.getCustomerName());
        System.out.printf("y : %s.\n", y.getCustomerName());

    }

    public static void main(String[] args) {
        Customer s1 = new Customer("Daniel");
        Customer s2 = new Customer("Sam");

        swap(s1, s2);

        System.out.printf("s1 : %s.\n", s1.getCustomerName());
        System.out.printf("s2 : %s.\n", s2.getCustomerName());


        //不是说 方法得到的是对象引用的拷贝, 对象引用和其他的拷贝同时引用同一个对象吗？为什么拷贝交换后, 引用对象却没有交换呢

        //假定 s1(Daniel) 引用的是 Customer1, 那么在swap()初始化中, x引用的也是Customer1, 此时x(Daniel)
        //同上 s2(Sam)    引用的是 Customer2, 那么 y 引用的也是Customer2, 此时y(Sam)

        //交换后,我们会发现 x与y互相交换了对象,而 s1 s2 却没有交换。  简单来说，即:
        //此时  s1(Daniel) 引用的仍然是 Customer1 ,  y交换后引用的也是 Customer1
        //此时  s2(Sam)    引用的仍然是 Customer2 ,  x交换后引用的也是 Customer2

        //所以我们可以得出这个结论
        //方法并没有改变存储在变量 s1 和 s2 中的对象引用。swap方法的参数x和y被初始化为两个对象引用的拷贝，这个方法交换的是这两个拷贝


        //Why?
        //因为Java对对象采用的不是引用调用, 实际上,对象引用是按 值传递的。  (值,指的是对象指向内存地址中的地址值)
        //因此 x 与 y交换的是它们内存地址值, 这是不会影响到 s1 与 s2的
    }
}
