package com.psh10066.designpatterns._03_behavioral_patterns._18_memento._02_after;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Game {

    private int blueTeamScore;
    private int redTeamScore;

    public GameSave save() {
        return new GameSave(blueTeamScore, redTeamScore);
    }

    public void restore(GameSave gameSave) {
        this.blueTeamScore = gameSave.getBlueTeamScore();
        this.redTeamScore = gameSave.getRedTeamScore();
    }
}
