package com.psh10066.designpatterns._03_behavioral_patterns._22_template._02_after.template_method;

public class Client {

    public static void main(String[] args) {
        FileProcessor plus = new Plus("src/main/resources/numbers.txt");
        int result1 = plus.process();
        System.out.println(result1);

        FileProcessor minus = new Minus("src/main/resources/numbers.txt");
        int result2 = minus.process();
        System.out.println(result2);
    }
}
