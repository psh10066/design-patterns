package com.psh10066.designpatterns._03_behavioral_patterns._14_command._02_after;

import com.psh10066.designpatterns._03_behavioral_patterns._14_command._00_common.Game;
import com.psh10066.designpatterns._03_behavioral_patterns._14_command._00_common.Light;

public class App {

    public static void main(String[] args) {
        Button button = new Button();
        button.press(new LightOnCommand(new Light()));
        button.press(new GameStartCommand(new Game()));
        button.undo();
        button.undo();
    }
}
