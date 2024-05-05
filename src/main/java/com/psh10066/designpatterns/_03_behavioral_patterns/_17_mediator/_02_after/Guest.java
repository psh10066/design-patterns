package com.psh10066.designpatterns._03_behavioral_patterns._17_mediator._02_after;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Guest {

    private final int guestId;
    private final String roomNumber;

    private final FrontDesk frontDesk;

    public void dinner() {
        this.frontDesk.dinner(this);
    }

    public void getTowels(int numberOfTowels) {
        this.frontDesk.getTowels(this, numberOfTowels);
    }
}
