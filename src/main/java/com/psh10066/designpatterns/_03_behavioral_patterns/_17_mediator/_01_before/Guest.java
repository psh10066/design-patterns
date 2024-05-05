package com.psh10066.designpatterns._03_behavioral_patterns._17_mediator._01_before;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Guest {

    private final int guestId;
    private final String roomNumber;

    private final Restaurant restaurant;
    private final CleaningService cleaningService;

    public void dinner() {
        this.restaurant.dinner(this);
    }

    public void getTowels(int numberOfTowels) {
        this.cleaningService.getTowels(this, numberOfTowels);
    }
}
