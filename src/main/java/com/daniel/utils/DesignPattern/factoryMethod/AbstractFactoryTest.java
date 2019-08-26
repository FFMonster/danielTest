package com.daniel.utils.DesignPattern.factoryMethod;

public class AbstractFactoryTest {
    public static void main(String[] args) {

        try {
            Product a;
            Factory af;
            //在这里获得实际生产product的factory
            //concreteFactory1  or  concreteFactory2
            af = (Factory) ReadXML.getObject();
            a = af.newProduct();
            a.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
