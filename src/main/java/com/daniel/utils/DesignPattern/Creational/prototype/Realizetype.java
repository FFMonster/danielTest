package com.daniel.utils.DesignPattern.Creational.prototype;

/**
 * @author Daniel Zhang
 * @createTime 2019/8/26
 * @description
 */
public class Realizetype implements Cloneable {
    private String name;
    private Integer age;
    private String sex;

    Realizetype(String name, Integer age ,String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        System.out.println("具体原型创建成功!");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功!");
        return (Realizetype) super.clone();
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }
}
