package com.ut.spring.spring_introduction;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3
{
    public static void  main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextT3.xml");

      Person person = context.getBean("myPerson", Person.class);
      person.callYourPet();

      // 9. Внедрение строк и других значений
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

      context.close();
    }
}
