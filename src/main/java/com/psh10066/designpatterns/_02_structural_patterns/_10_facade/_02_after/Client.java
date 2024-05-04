package com.psh10066.designpatterns._02_structural_patterns._10_facade._02_after;

public class Client {

    public static void main(String[] args) {
        String to = "psh10066@gmail.com";
        String from = "psh10066@naver.com";
        String host = "127.0.0.1";
        String subject = "Test Mail from Java Program";
        String text = "message";

        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost(host);

        EmailSender emailSender = new EmailSender(emailSettings);

        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom(from);
        emailMessage.setTo(to);
        emailMessage.setSubject(subject);
        emailMessage.setText(text);

        emailSender.sendEmail(emailMessage);
    }
}
