package com.daniel.utils.DesignPattern.Structural.proxy;

public class Proxy implements Subject {
    private RealSubject realSubject;

    private void preRequest() {
        System.out.println("访问真实主题前预处理操作.");
    }

    @Override
    public void Requset() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.Requset();
        postRequest();
    }

    private void postRequest() {
        System.out.println("访问真实主题后续处理操作.");
    }
}
