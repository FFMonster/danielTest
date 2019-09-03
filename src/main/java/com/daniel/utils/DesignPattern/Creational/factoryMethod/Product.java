package com.daniel.utils.DesignPattern.Creational.factoryMethod;

public interface Product {

    //此处定义了 实现了 Product 接口的具体产品的规范行为,
    // 即只要该产品实现了Product接口,那它必可以调用show()方法。
    public void show();
}
