package com.psh10066.designpatterns._03_behavioral_patterns._17_mediator._01_before;

public class Hotel {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        CleaningService cleaningService = new CleaningService();

        Guest guest = new Guest(1, "room 101", restaurant, cleaningService);

        guest.dinner();
        guest.getTowels(3);
    }
}
