package com.ut.spring.spring_introduction;

import org.springframework.stereotype.Component;

//@Component("catBean") // закоментим так как по 2-му способу не происходит сканирования
public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat been is created");
    }

    @Override
    public void say() {
        System.out.println("Miu-Miu");
    }
}
