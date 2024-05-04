package com.psh10066.designpatterns._02_structural_patterns._12_proxy._03_java.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerfAspect {

    @Around("bean(gameService)")
    public void timestamp(ProceedingJoinPoint joinPoint) throws Throwable {
        long before = System.currentTimeMillis();
        joinPoint.proceed();
        System.out.println(System.currentTimeMillis() - before);
    }
}
