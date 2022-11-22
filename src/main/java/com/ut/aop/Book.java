package com.ut.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    public static String getName;
    @Value("Просто книга Мир!!!")
    String name;


    public String getName() {
        return name;
    }
}
