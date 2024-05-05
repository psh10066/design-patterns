package com.psh10066.designpatterns._03_behavioral_patterns._17_mediator._01_before;

public class Restaurant {

    public void dinner(Guest guest) {
        System.out.println("dinner to " + guest.getRoomNumber());
    }
}
