package com.psh10066.designpatterns._01_creational_patterns._02_factory_method._02_after;

import com.psh10066.designpatterns._01_creational_patterns._02_factory_method._00_common.Ship;

public class Client {

    public static void main(String[] args) {
        Ship whiteship = new WhiteshipFactory().orderShip("Whiteship", "psh10066@gmail.com");
        System.out.println(whiteship);

        Ship blackship = new BlackshipFactory().orderShip("Blackship", "psh10066@gmail.com");
        System.out.println(blackship);
    }

}
