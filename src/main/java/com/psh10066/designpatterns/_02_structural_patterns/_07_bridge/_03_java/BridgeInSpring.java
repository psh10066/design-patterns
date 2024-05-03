package com.psh10066.designpatterns._02_structural_patterns._07_bridge._03_java;

import org.springframework.jdbc.support.JdbcTransactionManager;
import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

public class BridgeInSpring {

    public static void main(String[] args) {
        // PSA(Portable Service Abstraction) : 환경의 변화와 관계없이 일관된 방식의 기술로의 접근 환경을 제공하는 추상화 구조.
        // Spring에서는 구체적인 부분에 해당하는 인터페이스를 많이 만들어 놓았다.
        MailSender mailSender = new JavaMailSenderImpl();

        // TransactionTemplate이 PlatformTransactionManager를 사용하고 있다.
        PlatformTransactionManager platformTransactionManager = new JdbcTransactionManager();
        TransactionTemplate transactionTemplate = new TransactionTemplate(platformTransactionManager);
    }
}
