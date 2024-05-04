package com.psh10066.designpatterns._03_behavioral_patterns._14_command._02_after;

import com.psh10066.designpatterns._03_behavioral_patterns._14_command._00_common.Light;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LightOnCommand implements Command {

    private final Light light;

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        new LightOffCommand(this.light).execute();
    }
}
