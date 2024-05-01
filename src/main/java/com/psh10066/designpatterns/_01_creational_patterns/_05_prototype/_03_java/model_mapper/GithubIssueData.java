package com.psh10066.designpatterns._01_creational_patterns._05_prototype._03_java.model_mapper;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GithubIssueData {

    private int id;

    private String title;

    private String repositoryUser;

    private String repositoryName;
}
