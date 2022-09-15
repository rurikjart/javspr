package com.ut.spring.spring_introduction;

public class Person {
    private Pet pet;
    private String surname;
    private  int age;

    public Person() {
        System.out.println("Person bean is created");

    }


    public void setPet(Pet pet) {
        System.out.println("Class Peron: set pet");
        this.pet=pet;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }

    public String getSurname() {
        System.out.println("Class person: getSurname");
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class person: setSurname");
        this.surname = surname;
    }

    public int getAge() {
        System.out.println("Class person: getAge");
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class person: setAge");
        this.age = age;
    }
}
