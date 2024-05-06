package com.psh10066.designpatterns._03_behavioral_patterns._19_observer._01_before;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer {

    private final Map<String, List<String>> messages = new HashMap<>();

    public void sendMessage(User user, String subject, String message) {
        String userMessage = user.getName() + " : " + message;
        if (messages.containsKey(subject)) {
            messages.get(subject).add(userMessage);
        } else {
            List<String> list = new ArrayList<>();
            list.add(userMessage);
            messages.put(subject, list);
        }
    }

    public String getMessage(String subject) {
        return messages.get(subject).getLast();
    }
}
