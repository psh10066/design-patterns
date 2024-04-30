package com.psh10066.designpatterns._01_creational_patterns._01_singleton._04_break_safety.enumeration;

// 권장하는 방법 중 하나. enum은 reflection에 안전하다.
// 다만 인스턴스가 미리 생성되며, 클래스에 상속을 할 수 없다.
public enum Settings {

    INSTANCE
}
