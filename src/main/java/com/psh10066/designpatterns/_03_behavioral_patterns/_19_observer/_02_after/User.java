package com.psh10066.designpatterns._03_behavioral_patterns._19_observer._02_after;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class User implements Subscriber {

    private final String name;

    @Override
    public void handleMessage(String message) {
        System.out.println(message + " (보는 사람 : " + this.name + ")");
    }
}
