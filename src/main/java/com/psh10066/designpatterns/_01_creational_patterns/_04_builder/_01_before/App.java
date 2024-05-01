package com.psh10066.designpatterns._01_creational_patterns._04_builder._01_before;

import com.psh10066.designpatterns._01_creational_patterns._04_builder._00_common.TourPlan;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        TourPlan longBeachTrip = new TourPlan();
        longBeachTrip.setTitle("롱비치 여행");
        longBeachTrip.setStartDate(LocalDate.of(2021, 7, 15));
        System.out.println(longBeachTrip);

        TourPlan cancunTrip = new TourPlan();
        cancunTrip.setTitle("칸쿤 여행");
        cancunTrip.setNights(2);
        cancunTrip.setDays(3);
        cancunTrip.setStartDate(LocalDate.of(2020, 12, 9));
        cancunTrip.setWhereToStay("리조트");
        cancunTrip.addPlan(0, "체크인 이후 짐풀기");
        cancunTrip.addPlan(0, "저녁 식사");
        cancunTrip.addPlan(1, "조식 부페에서 식사");
        cancunTrip.addPlan(1, "해변가 산책");
        cancunTrip.addPlan(1, "점심은 수영장 근처 음식점에서 먹기");
        cancunTrip.addPlan(1, "리조트 수영장에서 놀기");
        cancunTrip.addPlan(1, "저녁은 BBQ 식당에서 스테이크");
        cancunTrip.addPlan(2, "조식 부페에서 식사");
        cancunTrip.addPlan(2, "체크아웃");
        System.out.println(cancunTrip);
    }
}
