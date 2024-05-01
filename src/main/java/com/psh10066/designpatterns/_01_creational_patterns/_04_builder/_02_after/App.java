package com.psh10066.designpatterns._01_creational_patterns._04_builder._02_after;

import com.psh10066.designpatterns._01_creational_patterns._04_builder._00_common.TourPlan;

public class App {

    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefaultTourBuilder());

        TourPlan longBeachTrip = director.longBeachTrip();
        System.out.println(longBeachTrip);

        TourPlan cancunTrip = director.cancunTrip();
        System.out.println(cancunTrip);
    }
}
