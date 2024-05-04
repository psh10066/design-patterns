package com.psh10066.designpatterns._03_behavioral_patterns._14_command._01_before;

import com.psh10066.designpatterns._03_behavioral_patterns._14_command._00_common.Game;
import com.psh10066.designpatterns._03_behavioral_patterns._14_command._00_common.Light;

public class App {

    public static void main(String[] args) {
        LightOnButton lightOnButton = new LightOnButton(new Light());
        lightOnButton.press();

        GameStartButton gameStartButton = new GameStartButton(new Game());
        gameStartButton.press();

        GameEndButton gameEndButton = new GameEndButton(new Game());
        gameEndButton.press();

        LightOffButton lightOffButton = new LightOffButton(new Light());
        lightOffButton.press();
    }
}
