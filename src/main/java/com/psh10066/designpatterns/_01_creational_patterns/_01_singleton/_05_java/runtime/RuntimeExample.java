package com.psh10066.designpatterns._01_creational_patterns._01_singleton._05_java.runtime;

public class RuntimeExample {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.maxMemory());
        System.out.println(runtime.freeMemory());
    }
}
