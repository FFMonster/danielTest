package com.daniel.utils.DesignPattern.abstractFactory;

public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public Product1 newProduct1() {
        System.out.println("具体工厂2(农场2) 生成 → 具体产品 21...");
        return new ConcreteProduct21();
    }

    @Override
    public Product2 newProduct2() {
        System.out.println("具体工厂2(农场2) 生成 → 具体产品 22...");
        return new ConcreteProduct22();
    }
}
