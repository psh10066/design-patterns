package com.psh10066.designpatterns._01_creational_patterns._05_prototype._01_before;

import com.psh10066.designpatterns._01_creational_patterns._05_prototype._00_common.GithubRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class GithubIssue {

    private int id;

    private String title;

    private final GithubRepository repository;

    public String getUrl() {
        return String.format("https://github.com/%s/%s/issues/%d",
            repository.getUser(),
            repository.getName(),
            this.getId());
    }
}
