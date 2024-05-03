package com.psh10066.designpatterns._02_structural_patterns._07_bridge._03_java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jExample {

    // 새로운 로거를 만들더라도 Logger, LoggerFactory는 변하지 않는다.
    private static Logger logger = LoggerFactory.getLogger(Slf4jExample.class);

    public static void main(String[] args) {
        logger.info("hello logger");
    }
}
