package com.psh10066.designpatterns._01_creational_patterns._04_builder._02_after;

import com.psh10066.designpatterns._01_creational_patterns._04_builder._00_common.TourPlan;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@RequiredArgsConstructor
public class TourDirector {

    private final TourPlanBuilder tourPlanBuilder;

    public TourPlan longBeachTrip() {
        return tourPlanBuilder
            .title("롱비치 여행")
            .startDate(LocalDate.of(2021, 7, 15))
            .getPlan();
    }

    public TourPlan cancunTrip() {
        return tourPlanBuilder
            .title("칸쿤 여행")
            .nightsAndDays(2, 3)
            .startDate(LocalDate.of(2020, 12, 9))
            .whereToStay("리조트")
            .addPlan(0, "체크인 이후 짐풀기")
            .addPlan(0, "저녁 식사")
            .addPlan(1, "조식 부페에서 식사")
            .addPlan(1, "해변가 산책")
            .addPlan(1, "점심은 수영장 근처 음식점에서 먹기")
            .addPlan(1, "리조트 수영장에서 놀기")
            .addPlan(1, "저녁은 BBQ 식당에서 스테이크")
            .addPlan(2, "조식 부페에서 식사")
            .addPlan(2, "체크아웃")
            .getPlan();
    }
}
