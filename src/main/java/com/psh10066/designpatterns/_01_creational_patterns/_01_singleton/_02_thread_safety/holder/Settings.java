package com.psh10066.designpatterns._01_creational_patterns._01_singleton._02_thread_safety.holder;

public class Settings {

    private Settings() {}

    // 권장하는 방법 중 하나.
    // static inner 클래스를 사용하면 멀티 스레드 환경에서 안전하고, getInstance 호출 시에 inner 클래스가 로딩되므로 lazy loading도 가능하다.
    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }
}
