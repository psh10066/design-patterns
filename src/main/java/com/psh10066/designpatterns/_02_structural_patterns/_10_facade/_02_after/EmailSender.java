package com.psh10066.designpatterns._02_structural_patterns._10_facade._02_after;

import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.Session;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;

import java.util.Properties;

@RequiredArgsConstructor
public class EmailSender {

    private final EmailSettings emailSettings;

    public void sendEmail(EmailMessage emailMessage) {
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", emailSettings.getHost());

        Session session = Session.getDefaultInstance(properties);

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(emailMessage.getFrom()));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(emailMessage.getTo()));
            message.setSubject(emailMessage.getSubject());
            message.setText(emailMessage.getText());

            // 실제로 동작하지는 않는다.
//            Transport.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }


}
