package com.ut.spring.spring_introduction;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan("com.ut.spring.spring_introduction") // закоментим так как по 2-му способу не происходит сканирования
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet catBean() {
        System.out.println("!!!");
        return  new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }

}
