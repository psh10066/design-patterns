package com.psh10066.designpatterns._03_behavioral_patterns._20_state._02_after;

import com.psh10066.designpatterns._03_behavioral_patterns._20_state._00_common.Student;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class OnlineCourse {

    private State state = new Draft(this);

    private List<String> reviews = new ArrayList<>();

    private List<Student> students = new ArrayList<>();

    public void addReview(String review, Student student) {
        state.addReview(review, student);
    }

    public void addStudent(Student student) {
        state.addStudent(student);
    }

    public void changeState(State newState) {
        this.state = newState;
    }
}
