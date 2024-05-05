package com.psh10066.designpatterns._03_behavioral_patterns._18_memento._02_after;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public final class GameSave {

    private final int blueTeamScore;
    private final int redTeamScore;
}
