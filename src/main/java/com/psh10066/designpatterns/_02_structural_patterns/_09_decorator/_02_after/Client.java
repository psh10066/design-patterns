package com.psh10066.designpatterns._02_structural_patterns._09_decorator._02_after;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Client {

    private final CommentService commentService;

    public void writeComment(String comment) {
        commentService.addComment(comment);
    }
}
