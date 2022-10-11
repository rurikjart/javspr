package com.ut.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextScope.xml");

       /* Dog myDog = context.getBean("dog", Dog.class);
        Dog yourDog = context.getBean("dog", Dog.class);

        System.out.println("Переменные ссылаются на один и тот же объект? " + (myDog==yourDog));*/

        Dog myDog = context.getBean("dog", Dog.class);
    }
}
