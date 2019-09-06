package com.daniel.utils.DesignPattern.Structural.proxy;

public class RealSubject implements Subject {
    @Override
    public void Requset() {
        System.out.println("访问到真实主题.....");
    }
}
