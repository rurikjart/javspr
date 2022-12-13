package com.ut.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

   @Pointcut("execution(* com.ut.aop.UniLibrary.*(..))")
    private void allMethodsFromUniLibrary() {

   }

   @Pointcut("execution(public void com.ut.aop.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary() {

   }

   @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
    private  void allMethodsExceptReturnMagazineFromUniLibrary() {

   }

    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodsExceptReturnMagazineAdvice() {
       System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log #10");
    }



 /*   @Pointcut("execution(* com.ut.aop.UniLibrary.get*())")
    private  void allGetMethodsFromUniLibrary() {

    }

    @Pointcut("execution(* com.ut.aop.UniLibrary.return*())")
    private  void allReturnMethodsFromUniLibrary() {

    }

    // продолжить тут 12/12/2022

    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
    private void allGetAndReturnMethodsFromUniLibrary() {

    }

    // Адвайзы для пойнкатов

    @Before("allGetMethodsFromUniLibrary()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing Log #1");
    }

    @Before("allReturnMethodsFromUniLibrary()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
    }

    @Before("allGetAndReturnMethodsFromUniLibrary()")
    public void beforeGetAndReturnLoggingAdvice() {
        System.out.print("beforeGetAndReturnLoggingAdvice: writing Log #3");
    }*/



/*    //Определяем пойнткат и используем его в разных местах например пункт 1 или пункт 2
    @Pointcut("execution(* get*())")
    private void allGetMethods(){}
// пункт 1
    @Before("allGetMethods()") // работа передвыполнением кода из файла TestAOP.java
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: попытка получить книгу или журнал");
    }
// пункт 2
    @Before("allGetMethods()") // работа передвыполнением кода из файла TestAOP.java
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: попытка получить книгу или журнал");
    }*/

}
