package com.psh10066.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities._02_after;

import com.psh10066.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities._00_common.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class RequestHandler {

    private final RequestHandler nextHandler;

    public void handle(Request request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
