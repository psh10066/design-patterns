package com.psh10066.designpatterns._03_behavioral_patterns._14_command._01_before;

import com.psh10066.designpatterns._03_behavioral_patterns._14_command._00_common.Game;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GameEndButton {

    private final Game game;

    public void press() {
        game.end();
    }
}
