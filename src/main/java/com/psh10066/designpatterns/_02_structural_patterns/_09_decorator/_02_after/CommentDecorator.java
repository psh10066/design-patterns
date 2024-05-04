package com.psh10066.designpatterns._02_structural_patterns._09_decorator._02_after;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CommentDecorator implements CommentService {

    private final CommentService commentService;

    @Override
    public void addComment(String comment) {
        commentService.addComment(comment);
    }
}
