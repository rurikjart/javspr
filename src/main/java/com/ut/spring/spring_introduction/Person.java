package com.ut.spring.spring_introduction;

public class Person {
    private Pet pet;

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
}
