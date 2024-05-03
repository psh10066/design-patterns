package com.psh10066.designpatterns._02_structural_patterns._07_bridge._01_before;

import com.psh10066.designpatterns._02_structural_patterns._07_bridge._00_common.Champion;

public class App {

    public static void main(String[] args) {
        Champion kda아리 = new KDA아리();
        kda아리.move();
        kda아리.skillQ();

        Champion poolParty아리 = new PoolParty아리();
        poolParty아리.move();
        poolParty아리.skillQ();
    }
}
