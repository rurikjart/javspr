package com.ut.aop.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void  beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение" +
                "списка студентов перед методом getStudents");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void  afterReturningGetStudentsLoggingAdvice(List<Student> students) {


        Student firstStudent = students.get(0);

        //изменить имя студенту на нулевой позиции и записать его обратно в лист
        String nameSurname = firstStudent.getNameSurname();
        nameSurname = "Mr." + nameSurname;
        firstStudent.setNameSurname(nameSurname);

        // изменим среднюю оценку студенту
        double avgGrade = firstStudent.getAvgGrade();
        avgGrade = avgGrade + 1;
        firstStudent.setAvgGrade(avgGrade);





        System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение" +
                "списка студентов после работы метода getStudents");
    }

}
