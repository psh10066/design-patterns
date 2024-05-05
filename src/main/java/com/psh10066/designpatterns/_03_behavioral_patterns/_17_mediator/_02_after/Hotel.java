package com.psh10066.designpatterns._03_behavioral_patterns._17_mediator._02_after;

public class Hotel {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        CleaningService cleaningService = new CleaningService();
        FrontDesk frontDesk = new FrontDesk(restaurant, cleaningService);

        Guest guest = frontDesk.addGuest();

        guest.dinner();
        guest.getTowels(3);
    }
}
