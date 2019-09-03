package com.daniel.utils.DesignPattern.Creational.bulider;

public abstract class Builder {
    //建造者（Builder）模式由产品Product 、抽象建造者Bulider 、具体建造者ConcreteBuilder 、指挥者Director 等 4 个要素构成


    //抽象建造者(Builder): 它是一个包含创建产品各个子部件的抽象方法的接口，通常还包含一个返回复杂产品的方法 getResult()。
    protected Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    public Product getResult() {
        return product;
    }
}
