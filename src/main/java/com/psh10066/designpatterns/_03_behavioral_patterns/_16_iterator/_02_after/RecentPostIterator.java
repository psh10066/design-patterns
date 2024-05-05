package com.psh10066.designpatterns._03_behavioral_patterns._16_iterator._02_after;

import com.psh10066.designpatterns._03_behavioral_patterns._16_iterator._00_common.Post;

import java.util.Iterator;
import java.util.List;

public class RecentPostIterator implements Iterator<Post> {

    private final Iterator<Post> internalIterator;

    public RecentPostIterator(List<Post> posts) {
        posts.sort((p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
        this.internalIterator = posts.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.internalIterator.hasNext();
    }

    @Override
    public Post next() {
        return this.internalIterator.next();
    }
}
