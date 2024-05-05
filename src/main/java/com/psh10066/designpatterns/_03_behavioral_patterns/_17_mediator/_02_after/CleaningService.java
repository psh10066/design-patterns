package com.psh10066.designpatterns._03_behavioral_patterns._17_mediator._02_after;

public class CleaningService {

    public void getTowels(FrontDesk frontDesk, int guestId, int numberOfTowels) {
        String roomNumber = frontDesk.getRoomNumberFor(guestId);
        System.out.println(numberOfTowels + " towels to " + roomNumber);
    }
}
