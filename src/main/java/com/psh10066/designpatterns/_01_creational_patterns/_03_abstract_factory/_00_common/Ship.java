package com.psh10066.designpatterns._01_creational_patterns._03_abstract_factory._00_common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Ship {

    private String name;
    private String color;
    private String logo;
    private Wheel wheel;
    private Anchor anchor;
}
