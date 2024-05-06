package com.psh10066.designpatterns._03_behavioral_patterns._19_observer._03_java.spring;

import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MyRunner implements ApplicationRunner {

    private ApplicationEventPublisher publisher;

    @Override
    public void run(ApplicationArguments args) {
        publisher.publishEvent(new MyEvent("hello spring event"));
    }
}
