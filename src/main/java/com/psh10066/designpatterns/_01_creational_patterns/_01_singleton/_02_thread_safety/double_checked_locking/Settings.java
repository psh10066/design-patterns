package com.psh10066.designpatterns._01_creational_patterns._01_singleton._02_thread_safety.double_checked_locking;

public class Settings {

    private static volatile Settings instance;

    private Settings() {}

    // instance가 없는 경우에만 동기화하므로 성능 상 유리하나, 기법 자체가 복잡하다.
    // 또한 java 1.5 이상에서만 동작하고, volatile을 쓰는 것에 대한 이해가 필요한데, 매우 복잡하다.
    public static Settings getInstance() {
        if (instance == null) {
            synchronized (Settings.class) {
                if (instance == null) {
                    instance = new Settings();
                }
            }
        }
        return instance;
    }
}
