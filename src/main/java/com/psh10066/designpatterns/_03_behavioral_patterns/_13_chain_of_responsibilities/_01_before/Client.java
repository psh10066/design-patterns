package com.psh10066.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities._01_before;

import com.psh10066.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities._00_common.Request;

public class Client {

    public void doWork() {
        RequestHandler requestHandler = new AuthRequestHandler();

        Request request = new Request("무궁화 꽃이 피었습니다.");
        requestHandler.handle(request);
    }
}
