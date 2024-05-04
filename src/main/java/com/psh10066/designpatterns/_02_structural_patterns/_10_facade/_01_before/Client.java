package com.psh10066.designpatterns._02_structural_patterns._10_facade._01_before;

import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.Session;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;

public class Client {

    public static void main(String[] args) {
        String to = "psh10066@gmail.com";
        String from = "psh10066@naver.com";
        String host = "127.0.0.1";
        String subject = "Test Mail from Java Program";
        String text = "message";

        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);

        Session session = Session.getDefaultInstance(properties);

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(subject);
            message.setText(text);

            // 실제로 동작하지는 않는다.
//            Transport.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
