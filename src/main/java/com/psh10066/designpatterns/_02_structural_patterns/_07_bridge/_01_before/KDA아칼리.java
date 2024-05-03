package com.psh10066.designpatterns._02_structural_patterns._07_bridge._01_before;

import com.psh10066.designpatterns._02_structural_patterns._07_bridge._00_common.Champion;

public class KDA아칼리 implements Champion {

    @Override
    public void move() {
        System.out.println("KDA 아칼리 move");
    }

    @Override
    public void skillQ() {
        System.out.println("KDA 아칼리 Q");
    }

    @Override
    public void skillW() {
        System.out.println("KDA 아칼리 W");
    }

    @Override
    public void skillE() {
        System.out.println("KDA 아칼리 E");
    }

    @Override
    public void skillR() {
        System.out.println("KDA 아칼리 R");
    }
}
