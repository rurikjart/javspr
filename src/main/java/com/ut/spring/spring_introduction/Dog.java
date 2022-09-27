package com.ut.spring.spring_introduction;

public class Dog implements Pet {
    private String name;
    public Dog() {
        System.out.println("Dog been is created");
    }

    @Override
    public void say() {

        System.out.println("Bow-Wow");
    }
// инициализация бина
    public void init(){
        System.out.println("Class Dog: init method");
    }
// разрушение бина
    public void destroy(){
        System.out.println("Class Dog: destroy method");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
