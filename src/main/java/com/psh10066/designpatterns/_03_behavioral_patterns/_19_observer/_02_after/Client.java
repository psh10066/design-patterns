package com.psh10066.designpatterns._03_behavioral_patterns._19_observer._02_after;

public class Client {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();

        User user1 = new User("user1");

        chatServer.register(user1, "디자인패턴");
        chatServer.register(user1, "리팩토링");

        chatServer.sendMessage(user1, "디자인패턴", "이번엔 옵저버 패턴입니다.");
        chatServer.sendMessage(user1, "리팩토링", "이번엔 리팩토링입니다.");

        User user2 = new User("user2");

        chatServer.register(user2, "디자인패턴");

        chatServer.sendMessage(user2, "디자인패턴", "예제 코드 보는 중..");

        chatServer.unregister(user2, "디자인패턴");

        chatServer.sendMessage(user1, "디자인패턴", "마지막 메시지입니다.");
    }
}
