package com.psh10066.designpatterns._01_creational_patterns._04_builder._03_java;

import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        Stream<String> names = Stream.<String>builder()
            .add("psh10066")
            .add("@")
            .add("gmail")
            .add(".com")
            .build();
        names.forEach(System.out::print);
    }
}
