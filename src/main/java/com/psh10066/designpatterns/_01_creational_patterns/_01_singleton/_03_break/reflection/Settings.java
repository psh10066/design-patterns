package com.psh10066.designpatterns._01_creational_patterns._01_singleton._03_break.reflection;

public class Settings {

    private Settings() {}

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }
}
