package com.daniel.utils.DesignPattern.Creational.factoryMethod;

public class ConcreteFactory2 implements Factory {

    @Override
    public Product newProduct() {
        System.out.println("具体工厂2 → 具体产品2 ...");
        return new ConcreteProduct2();
    }
}
