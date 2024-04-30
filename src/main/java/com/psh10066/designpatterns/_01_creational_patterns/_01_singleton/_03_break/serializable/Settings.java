package com.psh10066.designpatterns._01_creational_patterns._01_singleton._03_break.serializable;

import java.io.Serializable;

public class Settings implements Serializable {

    private Settings() {}

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }

    // 역직렬화 시 readResolve를 사용하므로 싱글톤을 보장할 수 있다.
    protected Object readResolve() {
        return SettingsHolder.INSTANCE;
    }
}
