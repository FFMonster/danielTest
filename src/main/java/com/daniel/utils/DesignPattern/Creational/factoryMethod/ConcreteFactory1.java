package com.daniel.utils.DesignPattern.Creational.factoryMethod;

public class ConcreteFactory1 implements Factory {
    @Override
    public Product newProduct() {
        System.out.println("具体工厂1 → 具体产品1 ....");
        return new ConcreteProduct1();
    }
}
