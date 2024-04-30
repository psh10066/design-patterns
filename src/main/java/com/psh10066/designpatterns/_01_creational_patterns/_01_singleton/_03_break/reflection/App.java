package com.psh10066.designpatterns._01_creational_patterns._01_singleton._03_break.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings settings1 = Settings.getInstance();

        // 리플렉션으로 새로운 인스턴스를 생성하여 싱글톤을 깨뜨릴 수 있다.
        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings settings2 = constructor.newInstance();

        System.out.println(settings1 == settings2);
    }
}
