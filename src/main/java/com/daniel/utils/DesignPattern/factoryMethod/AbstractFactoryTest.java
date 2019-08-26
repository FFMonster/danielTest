package com.daniel.utils.DesignPattern.factoryMethod;

public class AbstractFactoryTest {
    public static void main(String[] args) {

        try {
            Product a;
            Factory af;
            af = (Factory) ReadXML.getObject();
            a = af.newProduct();
            a.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
