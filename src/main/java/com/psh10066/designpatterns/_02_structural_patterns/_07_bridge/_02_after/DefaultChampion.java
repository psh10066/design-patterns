package com.psh10066.designpatterns._02_structural_patterns._07_bridge._02_after;

import com.psh10066.designpatterns._02_structural_patterns._07_bridge._00_common.Champion;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DefaultChampion implements Champion {

    private Skin skin;
    private String name;

    @Override
    public void move() {
        System.out.printf("%s %s move\n", skin.getName(), this.name);
    }

    @Override
    public void skillQ() {
        System.out.printf("%s %s Q\n", skin.getName(), this.name);
    }

    @Override
    public void skillW() {
        System.out.printf("%s %s W\n", skin.getName(), this.name);
    }

    @Override
    public void skillE() {
        System.out.printf("%s %s E\n", skin.getName(), this.name);
    }

    @Override
    public void skillR() {
        System.out.printf("%s %s R\n", skin.getName(), this.name);
    }
}
