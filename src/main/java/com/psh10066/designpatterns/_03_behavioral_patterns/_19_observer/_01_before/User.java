package com.psh10066.designpatterns._03_behavioral_patterns._19_observer._01_before;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class User {

    private final String name;

    public void handleMessage(String message) {
        System.out.println(message + " (보는 사람 : " + this.name + ")");
    }
}
