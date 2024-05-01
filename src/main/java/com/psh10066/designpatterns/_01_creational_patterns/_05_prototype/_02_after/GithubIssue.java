package com.psh10066.designpatterns._01_creational_patterns._05_prototype._02_after;

import com.psh10066.designpatterns._01_creational_patterns._05_prototype._00_common.GithubRepository;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
public class GithubIssue implements Cloneable {

    private int id;

    private String title;

    private final GithubRepository repository;

    public String getUrl() {
        return String.format("https://github.com/%s/%s/issues/%d",
            repository.getUser(),
            repository.getName(),
            this.getId());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
