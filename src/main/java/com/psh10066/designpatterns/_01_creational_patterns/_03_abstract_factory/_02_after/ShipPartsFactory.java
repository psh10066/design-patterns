package com.psh10066.designpatterns._01_creational_patterns._03_abstract_factory._02_after;

import com.psh10066.designpatterns._01_creational_patterns._03_abstract_factory._00_common.Anchor;
import com.psh10066.designpatterns._01_creational_patterns._03_abstract_factory._00_common.Wheel;

public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();
}
