package com.psh10066.designpatterns._01_creational_patterns._01_singleton._05_java.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExample {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        // 싱글톤 scope. 엄밀히 따지면 싱글톤 패턴과는 다르지만 하나의 인스턴스를 가져오는 경우에 대한 예시.
        String hello1 = applicationContext.getBean("hello", String.class);
        String hello2 = applicationContext.getBean("hello", String.class);
        System.out.println(hello1 == hello2);
    }
}
