package com.ut.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        //Cat myCat = context.getBean("cat", Cat.class);
       // myCat.say();

        context.close();
    }
}
