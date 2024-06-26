package com.psh10066.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities._02_after;

import com.psh10066.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities._00_common.Request;

public class PrintRequestHandler extends RequestHandler {

    public PrintRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println(request.getBody());
        super.handle(request);
    }
}
