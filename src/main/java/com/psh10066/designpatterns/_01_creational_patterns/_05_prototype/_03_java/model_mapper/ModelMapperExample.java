package com.psh10066.designpatterns._01_creational_patterns._05_prototype._03_java.model_mapper;

import com.psh10066.designpatterns._01_creational_patterns._05_prototype._00_common.GithubRepository;
import com.psh10066.designpatterns._01_creational_patterns._05_prototype._01_before.GithubIssue;
import org.modelmapper.ModelMapper;

public class ModelMapperExample {

    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("psh10066");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제");

        // ModelMapper는 reflection을 통해 데이터를 알아내서 shallow copy를 도와준다.
        ModelMapper modelMapper = new ModelMapper();
        GithubIssueData githubIssueData = modelMapper.map(githubIssue, GithubIssueData.class);
        System.out.println(githubIssueData);
    }
}
