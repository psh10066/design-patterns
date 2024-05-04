package com.psh10066.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities._02_after;

import com.psh10066.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities._00_common.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Client {

    private final RequestHandler requestHandler;

    public void doWork() {
        Request request = new Request("무궁화 꽃이 피었습니다.");
        requestHandler.handle(request);
    }
}
