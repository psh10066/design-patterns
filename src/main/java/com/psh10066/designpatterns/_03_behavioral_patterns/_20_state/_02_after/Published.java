package com.psh10066.designpatterns._03_behavioral_patterns._20_state._02_after;

import com.psh10066.designpatterns._03_behavioral_patterns._20_state._00_common.Student;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public class Published implements State {

    @ToString.Exclude
    private final OnlineCourse onlineCourse;

    @Override
    public void addReview(String review, Student student) {
        this.onlineCourse.getReviews().add(review);
    }

    @Override
    public void addStudent(Student student) {
        this.onlineCourse.getStudents().add(student);
    }
}
