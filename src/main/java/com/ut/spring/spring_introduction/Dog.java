package com.ut.spring.spring_introduction;

public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog been is created");
    }

    @Override
    public void say() {

        System.out.println("Bow-Wow");
    }
}
