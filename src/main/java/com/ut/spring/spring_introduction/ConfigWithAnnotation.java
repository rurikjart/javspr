package com.ut.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");
        Cat myCat = context.getBean("catBean", Cat.class);
        myCat.say();

        context.close();
    }
}
