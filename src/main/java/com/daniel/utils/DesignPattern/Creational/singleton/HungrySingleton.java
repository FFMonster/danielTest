package com.daniel.utils.DesignPattern.Creational.singleton;

/*
 * 饿汉模式的单例模式设计
 * 饿汉  在类第一次被加载时，就生成单例。使得单例在 getInstance 前就已创建好单例
 * @param null
 * @return
 * @throws
 * @date 2019/8/26 11:07
 */
public class HungrySingleton {

    private static volatile HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    //由于在调用 getInstance 前,已经实例化了单例
    public static HungrySingleton getInstance() {
        return instance;
    }
}
