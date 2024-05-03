package com.psh10066.designpatterns._02_structural_patterns._08_composite._02_after;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Item implements Component {

    private String name;
    private int price;
}
