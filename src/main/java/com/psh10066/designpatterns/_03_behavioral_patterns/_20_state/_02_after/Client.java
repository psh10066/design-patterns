package com.psh10066.designpatterns._03_behavioral_patterns._20_state._02_after;

import com.psh10066.designpatterns._03_behavioral_patterns._20_state._00_common.Student;

public class Client {

    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse();

        Student student1 = new Student("student1");
        onlineCourse.addStudent(student1);

        onlineCourse.changeState(new Published(onlineCourse));

        Student student2 = new Student("student2");
        onlineCourse.addStudent(student2);

        onlineCourse.changeState(new Private(onlineCourse));

        onlineCourse.addReview("hello", student1);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());
        System.out.println(onlineCourse.getReviews());
    }
}
