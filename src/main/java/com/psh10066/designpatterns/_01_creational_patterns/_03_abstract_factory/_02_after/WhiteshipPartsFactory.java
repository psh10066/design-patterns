package com.psh10066.designpatterns._01_creational_patterns._03_abstract_factory._02_after;

import com.psh10066.designpatterns._01_creational_patterns._03_abstract_factory._00_common.Anchor;
import com.psh10066.designpatterns._01_creational_patterns._03_abstract_factory._00_common.Wheel;
import com.psh10066.designpatterns._01_creational_patterns._03_abstract_factory._00_common.WhiteAnchor;
import com.psh10066.designpatterns._01_creational_patterns._03_abstract_factory._00_common.WhiteWheel;

public class WhiteshipPartsFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
