package com.example.javalib;

import com.example.javalib.hello.Person;
import com.example.javalib.hello.Student;

public class Tester {
    public static void main(String[] args) {
//        Person person = new Person();
//        person.setWeight(70);
//        person.setHeight(1.7f);
//        person.hello();
//        person.BMI();
        Student student1 = new Student("AAA-001", "kevin", 70, 85);
        Student student2 = new Student("AAA-002", "hank", 76, 89);
        student1.print();
        student2.print();
    }
}
