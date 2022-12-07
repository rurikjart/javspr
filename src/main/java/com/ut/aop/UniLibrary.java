package com.ut.aop;

import org.springframework.stereotype.Component;


@Component
public class UniLibrary extends  AbstractLibrary {


    public void getBook() {
        System.out.println("Мы берем книгу из UniLibrary");

    }

    public void getMagazin() {
        System.out.println("Мы берем журнал из UniLibrary");
    }

}
