package com.psh10066.designpatterns._03_behavioral_patterns._14_command._02_after;

import com.psh10066.designpatterns._03_behavioral_patterns._14_command._00_common.Game;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GameStartCommand implements Command {

    private final Game game;

    @Override
    public void execute() {
        game.start();
    }

    @Override
    public void undo() {
        new GameEndCommand(this.game).execute();
    }
}
