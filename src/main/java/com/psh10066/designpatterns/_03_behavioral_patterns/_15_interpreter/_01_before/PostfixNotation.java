package com.psh10066.designpatterns._03_behavioral_patterns._15_interpreter._01_before;

import lombok.RequiredArgsConstructor;

import java.util.Stack;

@RequiredArgsConstructor
public class PostfixNotation {

    private final String expression;

    public void calculate() {
        Stack<Integer> numbers = new Stack<>();

        for (char c : this.expression.toCharArray()) {
            switch (c) {
                case '+':
                    numbers.push(numbers.pop() + numbers.pop());
                    break;
                case '-':
                    int right = numbers.pop();
                    int left = numbers.pop();
                    numbers.push(left - right);
                    break;
                default:
                    numbers.push(Integer.parseInt(c + ""));
            }
        }

        System.out.println(numbers.pop());
    }
}
