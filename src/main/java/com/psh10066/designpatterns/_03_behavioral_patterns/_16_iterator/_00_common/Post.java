package com.psh10066.designpatterns._03_behavioral_patterns._16_iterator._00_common;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Post {

    private String title;
    private LocalDateTime createdDateTime;

    public Post(String title) {
        this.title = title;
        this.createdDateTime = LocalDateTime.now();
    }
}
