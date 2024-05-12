package com.psh10066.designpatterns._03_behavioral_patterns._22_template._01_before;

public class Client {

    public static void main(String[] args) {
        PlusFileProcessor plus = new PlusFileProcessor("src/main/resources/numbers.txt");
        int result1 = plus.process();
        System.out.println(result1);

        MinusFileProcessor minus = new MinusFileProcessor("src/main/resources/numbers.txt");
        int result2 = minus.process();
        System.out.println(result2);
    }
}
