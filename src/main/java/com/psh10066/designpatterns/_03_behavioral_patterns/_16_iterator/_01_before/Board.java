package com.psh10066.designpatterns._03_behavioral_patterns._16_iterator._01_before;

import com.psh10066.designpatterns._03_behavioral_patterns._16_iterator._00_common.Post;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Board {

    List<Post> posts = new ArrayList<>();

    public void addPost(String content) {
        this.posts.add(new Post(content));
    }
}
