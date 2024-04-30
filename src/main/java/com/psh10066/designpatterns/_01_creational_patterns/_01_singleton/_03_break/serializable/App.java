package com.psh10066.designpatterns._01_creational_patterns._01_singleton._03_break.serializable;

import java.io.*;

public class App {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Settings settings1 = Settings.getInstance();
        Settings settings2;

        // Serializable을 구현한 클래스를 직렬화 후 역직렬화하면 생성자를 사용하여 인스턴스를 생성하기 때문에 싱글톤을 깨뜨릴 수 있다.
        // readResolve 메소드를 통해 역직렬화에서 싱글톤을 보장하도록 구현할 수 있다.
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings1);
        }
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings2 = (Settings) in.readObject();
        }

        System.out.println(settings1 == settings2);
    }
}
