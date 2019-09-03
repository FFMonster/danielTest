package com.daniel.utils.DesignPattern.Creational.bulider;

public class ConcreteBuilder extends Builder {
    //具体建造者(Concrete Builder): 继承 Builder 接口，完成复杂产品的各个部件的具体创建方法。

    @Override
    public void buildPartA() {
        product.setPartA("创建 产品零件A");
    }

    @Override
    public void buildPartB() {
        product.setPartB("创建 产品零件B");
    }

    @Override
    public void buildPartC() {
        product.setPartC("创建 产品零件C");
    }
}
