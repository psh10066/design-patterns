package com.psh10066.designpatterns._01_creational_patterns._03_abstract_factory._02_after;

import com.psh10066.designpatterns._01_creational_patterns._03_abstract_factory._00_common.Anchor;
import com.psh10066.designpatterns._01_creational_patterns._03_abstract_factory._00_common.Wheel;
import com.psh10066.designpatterns._01_creational_patterns._03_abstract_factory._00_common.WhiteAnchorPro;
import com.psh10066.designpatterns._01_creational_patterns._03_abstract_factory._00_common.WhiteWheelPro;

public class WhiteshipProPartsFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheelPro();
    }
}
