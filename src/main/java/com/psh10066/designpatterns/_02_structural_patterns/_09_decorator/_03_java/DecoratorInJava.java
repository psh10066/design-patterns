package com.psh10066.designpatterns._02_structural_patterns._09_decorator._03_java;

import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpServletResponseWrapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecoratorInJava {

    public static void main(String[] args) {
        // Collections가 제공하는 데코레이터 메소드 예제
        ArrayList list = new ArrayList<>();
        list.add(new Book());

        // Book 타입으로 체크하므로 이후 Item을 넣을 수 없다.
        List books = Collections.checkedList(list, Book.class);
//        books.add(new Item());

        // 불변 List로 만들어서 이후 객체를 추가할 수 없다.
        List unmodifiableList = Collections.unmodifiableList(list);
//        unmodifiableList.add(new Book());

        list.add(new Item());

        // 서블릿 요청 또는 응답 Wrapper
        HttpServletRequestWrapper requestWrapper;
        HttpServletResponseWrapper responseWrapper;
    }

    private static class Book {
    }

    private static class Item {
    }
}
