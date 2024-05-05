package com.psh10066.designpatterns._03_behavioral_patterns._17_mediator._01_before;

public class CleaningService {

    public void getTowels(Guest guest, int numberOfTowels) {
        System.out.println(numberOfTowels + " towels to " + guest.getRoomNumber());
    }
}
