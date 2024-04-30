package com.psh10066.designpatterns._01_creational_patterns._01_singleton._02_thread_safety.eager_initialization;

public class Settings {

    // 클래스가 로딩되는 시점의 이른 초기화(eager initialization)를 통해 return하므로 멀티 스레드 환경에서 안전하나, 미리 인스턴스를 생성하는 것 자체가 단점.
    private final static Settings INSTANCE = new Settings();

    private Settings() {}

    public static Settings getInstance() {
        return INSTANCE;
    }
}
