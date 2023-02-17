package com.ut.aop.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class UniversityLoggingAspectOnlyAfter {

    @After("execution(* getStudents())")
    public void  afterGetStudentsLoggingAdvice() {

        System.out.println("afterGetStudentsLoggingAdvice: логируем нормальное " +
                " окончание работы метода или выброс исключения");

    }

  }


