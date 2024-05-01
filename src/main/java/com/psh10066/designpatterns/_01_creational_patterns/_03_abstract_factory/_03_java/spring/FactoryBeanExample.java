package com.psh10066.designpatterns._01_creational_patterns._03_abstract_factory._03_java.spring;

import com.psh10066.designpatterns._01_creational_patterns._03_abstract_factory._00_common.Ship;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanExample {

    public static void main(String[] args) {
        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("config.xml");
        Ship whiteship1 = applicationContext1.getBean("whiteship", Ship.class);
        System.out.println(whiteship1);

        ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
        Ship whiteship2 = applicationContext2.getBean(Ship.class);
        System.out.println(whiteship2);
    }
}
