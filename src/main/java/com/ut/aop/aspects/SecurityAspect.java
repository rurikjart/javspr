package com.ut.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {
    @Before("com.ut.aop.aspects.MyPointcuts.allAddMethods()")
    public void  beforeAddSecurityAdvice() {
        System.out.println("beforeGetLoggingAdvice: проверка прав на получение книги/журнала");
        System.out.println("-----------------------------------------------------");
    }
}
