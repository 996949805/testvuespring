package com.lao.vuespring.beans;

public class Dog {
    private String name;
    private int age;
    private float weight;

    public String getName() {
        return name;
    }

    public Dog(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
