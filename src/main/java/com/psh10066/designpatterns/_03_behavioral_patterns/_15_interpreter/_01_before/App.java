package com.psh10066.designpatterns._03_behavioral_patterns._15_interpreter._01_before;

public class App {

    public static void main(String[] args) {
        PostfixNotation postfixNotation = new PostfixNotation("123+-");
        postfixNotation.calculate();
    }
}
