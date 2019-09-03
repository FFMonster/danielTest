package com.daniel.utils.DesignPattern.Creational.bulider;

public class Product {
    //产品角色(Product): 它是包含多个组成部件的复杂对象，由具体建造者来创建其各个部件。

    private String partA;
    private String partB;
    private String partC;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public void show() {
        System.out.printf("this is a product for : %s, %s, %s .", partA, partB, partC);
    }
}
