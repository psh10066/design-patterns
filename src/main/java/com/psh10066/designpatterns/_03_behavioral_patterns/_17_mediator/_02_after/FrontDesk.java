package com.psh10066.designpatterns._03_behavioral_patterns._17_mediator._02_after;

import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
public class FrontDesk {

    private Map<Integer, Guest> guests = new HashMap<>();
    private final Restaurant restaurant;
    private final CleaningService cleaningService;

    public Guest addGuest() {
        Guest guest = new Guest(1, "room 101", this);
        guests.put(guest.getGuestId(), guest);
        return guest;
    }

    public String getRoomNumberFor(int guestId) {
        return guests.get(guestId).getRoomNumber();
    }

    public void dinner(Guest guest) {
        restaurant.dinner(this, guest.getGuestId());
    }

    public void getTowels(Guest guest, int numberOfTowels) {
        cleaningService.getTowels(this, guest.getGuestId(), numberOfTowels);
    }
}
