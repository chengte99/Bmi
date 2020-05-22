package com.example.javalib.hello;

public class Student {
    static int pass = 60;
    String id;
    String name;
    int english;
    int math;

    public Student(String id, String name, int english, int math) {
        this.id = id;
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public void print() {
        System.out.println(id + "\t" + name + "\t" + english + "\t" + math + "\t" + getAverage());

    }

    public int getAverage() {
        return (english+math)/2;
    }
}
