package com.daniel.utils.DesignPattern.Creational.singleton;

/*
 * 懒汉模式的单例设计模式
 * 懒汉  指的是,在类加载时不马上生成单例。 只有当第一次getInstance时才会新建单例
 * @param null
 * @return
 * @throws
 * @date 2019/8/26 11:01
 */
public class LazySingleton {

    //确保 instance 在所有线程中保持同步
    private static volatile LazySingleton instance = null;

    //确保 无参构造函数为private(无法被所有外部方法调用)
    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
