package com.psh10066.designpatterns._01_creational_patterns._03_abstract_factory._01_before;

import com.psh10066.designpatterns._01_creational_patterns._03_abstract_factory._00_common.*;

public class WhiteshipProFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(new WhiteAnchorPro());
        ship.setWheel(new WhiteWheelPro());
        return ship;
    }
}
