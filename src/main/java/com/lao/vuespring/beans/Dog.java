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
}
