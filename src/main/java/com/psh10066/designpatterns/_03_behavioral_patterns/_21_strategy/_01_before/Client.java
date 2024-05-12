package com.psh10066.designpatterns._03_behavioral_patterns._21_strategy._01_before;

public class Client {

    public static void main(String[] args) {
        BlueLightRedLight game = new BlueLightRedLight();
        game.blueLight(1);
        game.redLight(2);
    }
}
