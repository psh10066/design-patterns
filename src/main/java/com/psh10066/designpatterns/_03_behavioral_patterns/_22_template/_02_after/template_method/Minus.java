package com.psh10066.designpatterns._03_behavioral_patterns._22_template._02_after.template_method;

public class Minus extends FileProcessor {

    public Minus(String path) {
        super(path);
    }

    @Override
    public int getResult(int result, int number) {
        return result - number;
    }
}
