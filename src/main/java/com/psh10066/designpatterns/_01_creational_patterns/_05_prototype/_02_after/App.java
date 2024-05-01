package com.psh10066.designpatterns._01_creational_patterns._05_prototype._02_after;

import com.psh10066.designpatterns._01_creational_patterns._05_prototype._00_common.GithubRepository;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("psh10066");
        repository.setName("live-study");

        GithubIssue githubIssue1 = new GithubIssue(repository);
        githubIssue1.setId(1);
        githubIssue1.setTitle("1주차 과제");

        System.out.println(githubIssue1);
        System.out.println(githubIssue1.getUrl());

        GithubIssue githubIssue2 = (GithubIssue) githubIssue1.clone();

        System.out.println(githubIssue2);
        System.out.println(githubIssue2.getUrl());

        System.out.println("======================");
        // clone 객체는 == false, equals true, getClass() == true
        System.out.println(githubIssue2 != githubIssue2);
        System.out.println(githubIssue2.equals(githubIssue2));
        System.out.println(githubIssue2.getClass() == githubIssue2.getClass());

        System.out.println("======================");
        // clone은 shallow copy이므로 내부 객체는 같은 객체를 사용한다.
        System.out.println(githubIssue2.getRepository() == githubIssue2.getRepository());
        repository.setUser("hjlee");
        System.out.println(githubIssue2.getRepository().getUser());
    }

}
