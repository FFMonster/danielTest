package com.daniel.utils.DesignPattern.Creational.prototype;

/**
 * @author Daniel Zhang
 * @createTime 2019/8/26
 * @description
 */
public class prototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype obj1 = new Realizetype("Daniel",23,"男");
        Realizetype obj2 = (Realizetype) obj1.clone();
        obj2.setName("Sam");

        System.out.println("obj1 = obj2 ?  " + (obj1 == obj2));
        System.out.printf("obj1 info :name : %s ; sex : %s ; age : %s. \n", obj1.getName(), obj1.getSex(), obj1.getAge());
        System.out.printf("obj2 info :name : %s ; sex : %s ; age : %s. \n", obj2.getName(), obj2.getSex(), obj2.getAge());

        //原型设计模式可以理解为先设计好一份模板，然后将信息套入，得到最初创建的实例。
        //除了最初创建的实例外,其他实例可以通过克隆形式获取。获取再根据自身的不同对 克隆实例修改
    }
}
