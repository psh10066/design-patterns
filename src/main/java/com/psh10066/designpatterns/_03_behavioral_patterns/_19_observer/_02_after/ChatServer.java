package com.psh10066.designpatterns._03_behavioral_patterns._19_observer._02_after;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer {

    private final Map<String, List<Subscriber>> subscribers = new HashMap<>();

    public void register(Subscriber subscriber, String subject) {
        if (subscribers.containsKey(subject)) {
            subscribers.get(subject).add(subscriber);
        } else {
            List<Subscriber> list = new ArrayList<>();
            list.add(subscriber);
            subscribers.put(subject, list);
        }
    }

    public void unregister(Subscriber subscriber, String subject) {
        if (subscribers.containsKey(subject)) {
            subscribers.get(subject).remove(subscriber);
        }
    }

    public void sendMessage(User user, String subject, String message) {
        if (subscribers.containsKey(subject)) {
            String userMessage = user.getName() + " : " + message;
            subscribers.get(subject).forEach(subscriber -> subscriber.handleMessage(userMessage));
        }
    }
}
