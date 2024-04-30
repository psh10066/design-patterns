package com.psh10066.designpatterns._01_creational_patterns._01_singleton._01_basic;

public class Settings {

    private static Settings instance;

    private Settings() {}

    public static Settings getInstance() {
        if (instance == null) {
            // 이 구문에 여러 스레드가 동시에 들어올 수 있어 thread-safe하지 않음
            instance = new Settings();
        }
        return instance;
    }
}
