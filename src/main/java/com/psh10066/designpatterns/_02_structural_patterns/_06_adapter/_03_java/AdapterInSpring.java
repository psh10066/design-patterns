package com.psh10066.designpatterns._02_structural_patterns._06_adapter._03_java;

import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

public class AdapterInSpring {

    public static void main(String[] args) {
        // HandlerAdapter : 우리가 작성하는 다양한 형태의 handler 코드를 Spring MVC가 실행할 수 있는 형태로 변환해주는 어댑터용 인터페이스
        HandlerAdapter handlerAdapter = new RequestMappingHandlerAdapter();
    }
}
