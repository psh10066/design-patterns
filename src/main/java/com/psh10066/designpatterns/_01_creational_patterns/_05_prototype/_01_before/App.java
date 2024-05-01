package com.psh10066.designpatterns._01_creational_patterns._05_prototype._01_before;

import com.psh10066.designpatterns._01_creational_patterns._05_prototype._00_common.GithubRepository;

public class App {

    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("psh10066");
        repository.setName("live-study");

        GithubIssue githubIssue1 = new GithubIssue(repository);
        githubIssue1.setId(1);
        githubIssue1.setTitle("1주차 과제");

        System.out.println(githubIssue1);
        System.out.println(githubIssue1.getUrl());

        GithubIssue githubIssue2 = new GithubIssue(repository);
        githubIssue2.setId(1);
        githubIssue2.setTitle("1주차 과제");

        System.out.println(githubIssue2);
        System.out.println(githubIssue2.getUrl());
    }

}
