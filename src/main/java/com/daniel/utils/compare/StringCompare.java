package com.daniel.utils.compare;

public class StringCompare {
    String name;
    int age;

    public StringCompare() {
    }

    public StringCompare(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        //String 的 ( == ) 比较方法,比较的是两个String对象指向的内存地址是否相同
        //String 的 .equals() 比较方法,比较的是两个String对象的数值是否相同
        String A = "Daniel";
        String B = "Daniel";
        String C = new String("Daniel");
        String D = new String("Daniel");
        String E = C;

        //A B 没有通过New关键字创建对象,而是作为一个基本类型使用。因此JVM不会分配新的内存,而是到缓冲池中查找
        //先为A找值为 "Daniel" 的对象,此时缓冲区没有,因此JVM此时会在缓冲池创建此String对象,即new String("Daniel");
        //然后把创建的String对象的引用赋值给A。因此String A = "Daniel";实际创建了两个对象
        // 1.对象String (值为Daniel)  2.对象A   对象A拥有对象String的引用
        System.out.println(A == B);
        //轮到B时,由于B不是通过New创建,因此继续进入缓冲池寻找,此时虚拟机找到了一个与其相同值的String对象,即为对象A所创建的对象String。
        //既然找到了一个相同值的对象,那么虚拟机就不在为此创建一个新的String对象,而是直接把存在的String对象的引用赋值给s2。
        System.out.println(A.equals(B));

        //总结1
        //1.如果String作为一个基本类型来使用,那么我们视此String对象是String缓冲池所拥有的。
        //2.如果String作为一个基本类型来使用,并且此时String缓冲池内不存在与其指定值相同的String对象,
        // 那么此时JVM将为此创建新的String对象,并存放在String缓冲池内。
        //3.如果String作为一个基本类型来使用,并且此时String缓冲池内存在与其指定值相同的String对象,
        // 那么此时JVM将不为此创建新的String对象,而直接返回已存在的String对象的引用。


        //C D 都是通过New关键字创建的对象,New关键字会为每个创建的对象分配一块新的、独立的内存堆。
        // 因此当通过"=="来比较它们所引用的是否是同一个对象时,它们的内存地址不相同,将返回false。
        // 而通过equals()方法来比较时,因为这两个对象所封装的字符串内容是完全相同的,则返回true。
        System.out.println(C == D);
        System.out.println(C.equals(D));

        //总结2
        //1.如果String是通过New关键词创建的,那么它将拥有一个新的内存地址


        //由于C 是通过New关键词创建的,因此它的内存地址必然会和A、B不一致
        System.out.println(A == C);//false
        System.out.println(B == C);//false
        System.out.println(A.equals(C));//A与C的值都是 Daniel,因此将会返回true


        //此时由于E = C, 所以E与C的内存地址一致(都指向缓冲池中值为"Daniel"的对象)
        //当更改C的值时,C将不指向缓冲池中值为"Daniel"的对象,而是再查找、新建值为"Daniel Zhang" 的对象,并引用它。所以C的内存将会改变
        //由于E指向值为"Daniel"的对象后没有发现改变，因此它的内存地址值一直不会发生改变
        //需要注意的地方是,虽然是E=C,但E指向的不是C,而是C当前指向的缓冲区的那个对象。因此E不会随着C的改变而改变
        C = "Daniel Zhang";
        System.out.println(C == E);//false
        System.out.println(C.equals(E));//false


        //进阶
        StringCompare daniel1 = new StringCompare("Daniel Zhang");
        StringCompare daniel2 = new StringCompare("Daniel Zhang");
        System.out.println(daniel1);//内存地址1
        System.out.println(daniel2);//内存地址2
        System.out.println(daniel1 == daniel2);//内存地址不同,将返回flase
        System.out.println(daniel1.equals(daniel2));//flase????,两个对象值都是Daniel Zhang,为什么会是fasle?

        //原因是daniel1.equals(daniel2)所使用的equals()是超类(Object类)中的方法(点击.equals()方法即可发现),
        //而String 对象使用的是它自己的.equals()方法,在String类的底层重写了超类(Object类)的equals() 和 hashCode() 方法。


    }
}
