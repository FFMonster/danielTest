package com.daniel.utils.compare;

public class IntegerCompare {
    public static void main(String[] args) {
        int x = 12345;
        int y = 12345;
        int z = 128;
        Integer a = 12345;
        Integer b = 12345;
        Integer c = 127;
        Integer d = 127;

        Integer ONE = new Integer(128);
        Integer TWO = new Integer(128);

        //int 为基本数据类型, 它们之间的 ( == ) 比较，比较的是对象的数值(即12345)
        System.out.println(x == y);//true

        //Integer 包装数据类型, 它们之间的 ( == ) 比较,比较的是对象的内存存放地址(a在内存中的地址 != b在内存中的地址)
        System.out.println(a == b);//false

        //Integer 包装数据类型, 它们之间的 ( == ) 比较,比较的是对象的内存存放地址()
        //但是!!!!!!!
        //因为Java里面对处在在-128~127之间的Integer值,用的是原生数据类型int,会在内存里供重用.
        // 也就是说这之间的Integer值进行==比较时只是进行int原生数据类型的数值比较(c d 此时等价于int类型)
        System.out.println(c == d);//true

        //Integer 包装数据类型的.equals()方法,是把Integer类型转为int类型后,进行int类型的( == ) 比较。即数值比较
        System.out.println(a.equals(b));//true
        //原理同上 int与Integer 进行.equals()对比时，会先把Integer拆箱成 int
        System.out.println(a.equals(x));//true

        //当新建两个Integer类型并赋予相同值时。它们的 数值相等，但是内存中的地址不同. 此时( == )比较的是内存地址、.equals()比较的是数值
        System.out.println(ONE == TWO);//false
        System.out.println(ONE.equals(TWO));//true

        //当Integer 与 int 进行比较时,Integer一定先进行拆箱,再进行对比。so此时的( == )与.equals()对比。皆是在对象都是int的前提下进行的
        System.out.println(ONE == z);//true
        System.out.println(TWO == z);//true
        System.out.println(ONE.equals(z));//true

        //总结 2019.07.23
        //int 类型的 ( == ). 比较的的是两个int类型对象的数值。

        //Integer类型的 ( == ). 比较的是两个Integer类型对象的内存地址是否一致。
        // 注意:int类型中,-128——127取值范围内时,是直接从内存中调用的。
        // 因此当Integer对象取值在-128——127区间时，进行( == )对比时。实际只是进行int类型的( == )对比，即只进行数值对比。

        //Integer类型的 .equals()方法，其代码实际为把Integer类型对象拆箱，转为int基本类型,再进行int类型的( == )对比
        //因此，可以把Integer的 .equals()方法，等价为数值对比

        //Integer 与 int 比较时。Integer类型会先进行拆箱成int类型,然后再比较。所以 比较的方法都是以int类型的( == )比较
    }
}
