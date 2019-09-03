package com.daniel.utils.DesignPattern.Creational.singleton;

public class LazySingletonSupply {
    private static volatile LazySingletonSupply instance = null;

    private LazySingletonSupply() {
        System.out.println("创建一个新学生!");
    }

    public static synchronized LazySingletonSupply getInstance() {
        if (instance == null) {
            instance = new LazySingletonSupply();
        } else {
            System.out.println("已经有一位新学生了!");
        }
        return instance;
    }

    public void getName() {
        System.out.println("我是一名小学生:daniel zhang");
    }

    public static void main(String[] args) {
        LazySingletonSupply studentA = LazySingletonSupply.getInstance();
        studentA.getName();
        LazySingletonSupply studentB = LazySingletonSupply.getInstance();
        studentB.getName();
        if (studentA == studentB) {
            System.out.println("他们是同一个学生!");
        } else {
            System.out.println("他们不是同一个学生!!!");

        }


    }
}
