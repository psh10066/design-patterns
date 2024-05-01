package com.psh10066.designpatterns._01_creational_patterns._02_factory_method._02_after;

import com.psh10066.designpatterns._01_creational_patterns._02_factory_method._00_common.Ship;

public class BlackshipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new Blackship();
    }
}
