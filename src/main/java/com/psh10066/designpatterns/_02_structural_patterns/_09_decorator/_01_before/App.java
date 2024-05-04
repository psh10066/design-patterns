package com.psh10066.designpatterns._02_structural_patterns._09_decorator._01_before;

public class App {

    private static boolean enabledTrimming = true;
    private static boolean enabledSpamFilter = true;

    public static void main(String[] args) {

        CommentService commentService = new CommentService();

        if (enabledTrimming && enabledSpamFilter) {
            commentService = new TrimmingAndSpamFilteringCommentService();
        } else if (enabledTrimming) {
            commentService = new TrimmingCommentService();
        } else if (enabledSpamFilter) {
            commentService = new SpamFilteringCommentService();
        }

        Client client = new Client(commentService);
        client.writeComment("오징어게임");
        client.writeComment("보는 게 하는 것 보다 재밌을 수가 없지...");
        client.writeComment("https://hojun-dev.tistory.com");
    }
}
