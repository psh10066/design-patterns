package com.psh10066.designpatterns._01_creational_patterns._05_prototype._03_java.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {

    public static void main(String[] args) {
        Student psh10066 = new Student("psh10066");
        Student hjlee = new Student("hjlee");

        // ArrayList, HashMap 등은 Cloneable을 구현하고 있지만, 보통 우리가 타입을 상위 인터페이스로 선언하기 때문에 이 방법은 잘 사용히지 않는다.
        ArrayList<Student> students1 = new ArrayList<>();
        students1.add(psh10066);
        students1.add(hjlee);

        List<Student> clone1 = (ArrayList<Student>) students1.clone();
        System.out.println(clone1);

        // 아래 방법은 프로토타입 패턴은 아니지만, 보통 컬렉션을 shallow copy할 때는 아래와 같은 방법을 사용한다.
        List<Student> students2 = new ArrayList<>();
        students2.add(psh10066);
        students2.add(hjlee);

        List<Student> clone2 = new ArrayList<>(students2);
        System.out.println(clone2);
    }
}
