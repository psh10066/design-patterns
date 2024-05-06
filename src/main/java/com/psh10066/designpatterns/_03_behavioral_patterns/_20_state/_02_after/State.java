package com.psh10066.designpatterns._03_behavioral_patterns._20_state._02_after;

import com.psh10066.designpatterns._03_behavioral_patterns._20_state._00_common.Student;

public interface State {

    void addReview(String review, Student student);

    void addStudent(Student student);
}
