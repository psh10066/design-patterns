package com.psh10066.designpatterns._02_structural_patterns._11_flyweight._03_java;

public class FlyweightInJava {

    public static void main(String[] args) {
        // Integer.valueOf()는 자주 사용되는 127까지는 캐싱이 적용되어 있다.
        Integer i1 = Integer.valueOf(127);
        Integer i2 = Integer.valueOf(127);
        System.out.println(i1 == i2); // true

        Integer i3 = Integer.valueOf(128);
        Integer i4 = Integer.valueOf(128);
        System.out.println(i3 == i4); // false
    }
}
