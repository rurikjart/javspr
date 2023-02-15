package com.ut.aop;

import com.ut.aop.aspects.Student;
import com.ut.aop.aspects.Univercity;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Univercity univercity = context.getBean("univercity", Univercity.class);
        univercity.addStudents();

        try {
            List<Student> students = univercity.getStudents();
            System.out.println(students);
        } catch (Exception e){
            System.out.println("Было поймано исключение " + e);
        }



        context.close();

    }

}
