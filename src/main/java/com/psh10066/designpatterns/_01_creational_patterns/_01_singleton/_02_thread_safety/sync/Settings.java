package com.psh10066.designpatterns._01_creational_patterns._01_singleton._02_thread_safety.sync;

public class Settings {

    private static Settings instance;

    private Settings() {}

    // synchronized를 통해 멀티 스레드 환경에서 안전해질 수 있으나, 성능 저하의 여지가 있다.
    public static synchronized Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }
}
