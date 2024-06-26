package com.psh10066.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities._03_java.spring;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter(urlPatterns = "/hello")
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("게임에 참여하신 여러분 모두 진심으로 환영합니다.");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("꽝!");
    }
}
