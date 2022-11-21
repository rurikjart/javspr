package com.ut.aop;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAOP {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class); //используется класс MyConfig.java  с аннотацией @EnableAspectJAutoProxy

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class); // используется Library,.java для основного метода
        uniLibrary.getBook();


        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class); // используется Library,.java для основного метода
        schoolLibrary.getBook();
        schoolLibrary.returnBook();
        schoolLibrary.getMagazine();

        context.close();
    }
}
