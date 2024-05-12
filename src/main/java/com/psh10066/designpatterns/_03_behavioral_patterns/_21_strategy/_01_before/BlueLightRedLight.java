package com.psh10066.designpatterns._03_behavioral_patterns._21_strategy._01_before;

public class BlueLightRedLight {

    public void blueLight(int speed) {
        if (speed == 1) {
            System.out.println("무  궁  화      꽃  이");
        } else if (speed == 2) {
            System.out.println("무 궁 화   꽃 이");
        } else {
            System.out.println("무궁화 꽃이");
        }

    }

    public void redLight(int speed) {
        if (speed == 1) {
            System.out.println("피  었  습  니  다.");
        } else if (speed == 2) {
            System.out.println("피 었 습 니 다.");
        } else {
            System.out.println("피었습니다.");
        }
    }
}
