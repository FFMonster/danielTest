package com.daniel.utils.DesignPattern.abstractFactory;

public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public Product1 newProduct1() {
        System.out.println("具体工厂1(农场1) 生成 → 具体产品 11...");
        return new ConcreteProduct11();
    }

    @Override
    public Product2 newProduct2() {
        System.out.println("具体工厂1(农场1) 生成 → 具体产品 11...");
        return new ConcreteProduct12();
    }
}
