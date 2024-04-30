package com.psh10066.designpatterns._01_creational_patterns._01_singleton._04_break_safety.enumeration;

public class App {

    public static void main(String[] args) {
        Settings settings1 = Settings.INSTANCE;
        Settings settings2 = Settings.INSTANCE;
        System.out.println(settings1 == settings2);
    }
}
