package com.psh10066.designpatterns._03_behavioral_patterns._20_state._02_after;

import com.psh10066.designpatterns._03_behavioral_patterns._20_state._00_common.Student;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public class Draft implements State {

    @ToString.Exclude
    private final OnlineCourse onlineCourse;

    @Override
    public void addReview(String review, Student student) {
        throw new UnsupportedOperationException("리뷰를 작성할 수 없습니다.");
    }

    @Override
    public void addStudent(Student student) {
        this.onlineCourse.getStudents().add(student);
    }
}
