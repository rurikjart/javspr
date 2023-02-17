package com.ut.aop.aspects;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class UniversityLoggingAspectThrow {

    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
    public void  afterThrowingGetStudentsLoggingAdvice(Throwable exception) {

        System.out.println("afterThrowingGetStudentsLoggingAdvice: логируем выброс" +
                "исключения " + exception + " методом getStudents");

    }

  }


