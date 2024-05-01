package com.psh10066.designpatterns._01_creational_patterns._03_abstract_factory._01_before;

import com.psh10066.designpatterns._01_creational_patterns._03_abstract_factory._00_common.Ship;
import com.psh10066.designpatterns._01_creational_patterns._03_abstract_factory._00_common.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory whiteshipFactory = new WhiteshipFactory();
        Ship whiteship = whiteshipFactory.createShip();
        System.out.println(whiteship.getAnchor().getClass());
        System.out.println(whiteship.getWheel().getClass());

        ShipFactory whiteshipProFactory = new WhiteshipProFactory();
        Ship whiteshipPro = whiteshipProFactory.createShip();
        System.out.println(whiteshipPro.getAnchor().getClass());
        System.out.println(whiteshipPro.getWheel().getClass());
    }

}
