package com.psh10066.designpatterns._01_creational_patterns._02_factory_method._03_java.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public String hello() {
        return "hello";
    }

}
