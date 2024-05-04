package com.psh10066.designpatterns._03_behavioral_patterns._14_command._01_before;

import com.psh10066.designpatterns._03_behavioral_patterns._14_command._00_common.Light;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LightOffButton {

    private final Light light;

    public void press() {
        light.off();
    }
}
