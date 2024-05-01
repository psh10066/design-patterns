package com.psh10066.designpatterns._01_creational_patterns._03_abstract_factory._02_after;

import com.psh10066.designpatterns._01_creational_patterns._03_abstract_factory._00_common.*;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class WhiteshipFactory implements ShipFactory {

    private final ShipPartsFactory shipPartsFactory;

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
