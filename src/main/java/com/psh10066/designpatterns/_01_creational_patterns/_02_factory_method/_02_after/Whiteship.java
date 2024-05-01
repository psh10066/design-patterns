package com.psh10066.designpatterns._01_creational_patterns._02_factory_method._02_after;

import com.psh10066.designpatterns._01_creational_patterns._02_factory_method._00_common.Ship;

public class Whiteship extends Ship {

    public Whiteship() {
        setName("Whiteship");
        setLogo("\uD83D\uDEE5");
        setColor("white");
    }
}
