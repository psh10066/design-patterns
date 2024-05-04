package com.psh10066.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities._01_before;

import com.psh10066.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities._00_common.Request;

public class AuthRequestHandler extends LoggingRequestHandler {

    @Override
    public void handle(Request request) {
        System.out.println("인증이 되었는가?");
        super.handle(request);
    }
}
