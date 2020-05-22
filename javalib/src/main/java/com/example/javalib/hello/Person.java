package com.example.javalib.hello;

public class Person {
    float weight;
    float height;

    public void hello() {
        System.out.println("Hello world");
    }

    public void BMI() {
        System.out.println(weight/(height*height));
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
