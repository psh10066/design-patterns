package com.psh10066.designpatterns._03_behavioral_patterns._17_mediator._02_after;

public class Restaurant {

    public void dinner(FrontDesk frontDesk, int guestId) {
        String roomNumber = frontDesk.getRoomNumberFor(guestId);
        System.out.println("dinner to " + roomNumber);
    }
}
