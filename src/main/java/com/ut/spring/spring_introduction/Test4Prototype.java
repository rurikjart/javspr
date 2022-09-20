package com.ut.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4Prototype {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextT5.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.setName("Belka");
        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.setName("Strelka");

        System.out.println("Переменные ссылаются на один и тот же объект" +
                (myDog==yourDog));
        System.out.println(myDog);
        System.out.println(yourDog);

        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());

        //незабываем закрывать контекст
        context.close();
    }
}
