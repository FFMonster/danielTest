package com.daniel.utils.DesignPattern.factoryMethod;

public interface Factory {

    // 接口Factory 功能是 生产 Product 接口类型的产品(虚拟产品)。
    // 因此凡是实现了Product 接口的 具体产品 , 都可以通过 Factory 接口生产
    public Product newProduct();
}
