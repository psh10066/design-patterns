package com.psh10066.designpatterns._03_behavioral_patterns._14_command._02_after;

import com.psh10066.designpatterns._03_behavioral_patterns._14_command._00_common.Light;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LightOffCommand implements Command {

    private final Light light;

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        new LightOnCommand(this.light).execute();
    }
}
