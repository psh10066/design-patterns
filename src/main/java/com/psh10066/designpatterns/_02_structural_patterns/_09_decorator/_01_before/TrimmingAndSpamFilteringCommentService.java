package com.psh10066.designpatterns._02_structural_patterns._09_decorator._01_before;

public class TrimmingAndSpamFilteringCommentService extends CommentService {

    @Override
    public void addComment(String comment) {

        if (!isSpam(comment)) {
            System.out.println(trim(comment));
        }
    }

    private String trim(String comment) {
        return comment.replace("...", "");
    }

    private boolean isSpam(String comment) {
        return comment.contains("http");
    }
}
