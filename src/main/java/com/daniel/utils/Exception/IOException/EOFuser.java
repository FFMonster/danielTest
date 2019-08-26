package com.daniel.utils.Exception.IOException;

import java.io.Serializable;

public class EOFuser implements Serializable {
    private static final long serialVersionUID = 1L;
    public String name;
    public Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public EOFuser(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "EOFuser [" + "name='" + name + '\'' + ", age=" + age + ']';
    }
}
