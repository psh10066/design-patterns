package com.psh10066.designpatterns._03_behavioral_patterns._22_template._02_after.template_callback;

public class Client {

    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("src/main/resources/numbers.txt");
        int result1 = fileProcessor.process(Integer::sum);
        System.out.println(result1);

        int result2 = fileProcessor.process((result, number) -> result - number);
        System.out.println(result2);
    }
}
