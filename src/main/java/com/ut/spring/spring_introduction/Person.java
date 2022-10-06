package com.ut.spring.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

   // @Qualifier("catBean")
   // @Autowired
    private Pet pet;
    @Value("Artyukhov")
    private String surname;
    @Value("33")
    private  int age;

    @Autowired
    public Person(@Qualifier("catBean") Pet pet) { // внедрение зависимости через конструктор класса с параметром
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    //public Person() {
    //    System.out.println("Person bean is created");
    // }

//@Autowired
//@Qualifier("dog") //   внедрение зависимости с помощью сеттера
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
