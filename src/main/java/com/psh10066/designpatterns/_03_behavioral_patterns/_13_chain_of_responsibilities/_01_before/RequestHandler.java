package com.psh10066.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities._01_before;

import com.psh10066.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities._00_common.Request;

public class RequestHandler {

    public void handle(Request request) {
        System.out.println(request.getBody());
    }
}
