package com.daniel.utils.DesignPattern.abstractFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        //抽象工厂模式定义 : 是一种为访问类提供一个创建一组相关或相互依赖对象的接口，且访问类无须指定所要产品的具体类就能得到同族的不同等级的产品的模式结构。
        //抽象工厂模式是工厂设计模式的升级版本,工厂方法模式只生产一个等级的产品，而抽象工厂模式可生产多个等级的产品。

        //使用抽象工厂模式一般需要满足以下
        //1.系统中有多个产品族(家畜、水果),每个具体工厂创建同一族但属于不同等级结构的产品(鸡/鸭、桃子/苹果);
        //2.系统一次只可能消费其中某一族产品,即同族的产品一起使用。

        //优点:
        //1.可以在类的内部对产品族中相关联的多等级产品共同管理,而不必专门引入多个新的类来进行管理。
        //2.当增加一个新的产品族时不需要修改原代码,满足开闭原则。(只需要在AbstractFactory 引入新产品族)

        //缺点:
        //当产品族中需要增加一个新的产品时,所有的工厂类都需要更改。(ConcreteFactory1 、 ConcreteFactory2 都需要修改以增加新产品)

        //抽象工厂 、 具体工厂 、 抽象产品 、具体产品 四要素构成
        try {
            AbstractFactory af;
            Product1 product1;
            Product2 product2;

            af = (AbstractFactory) ReadXML.getObject();

            product1 = af.newProduct1();
            product2 = af.newProduct2();
            product1.show();
            product2.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
