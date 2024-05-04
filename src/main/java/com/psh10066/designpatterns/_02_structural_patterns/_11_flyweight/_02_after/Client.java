package com.psh10066.designpatterns._02_structural_patterns._11_flyweight._02_after;

public class Client {

    public static void main(String[] args) {
        // 인스턴스 생성 시 변하지 않는 속성을 분리하고 재사용하여 메모리 사용량을 줄인다.
        FontFactory fontFactory = new FontFactory();
        Character c1 = new Character('h', "white", fontFactory.getFont("Nanum:12"));
        Character c2 = new Character('e', "white", fontFactory.getFont("Nanum:12"));
        Character c3 = new Character('l', "white", fontFactory.getFont("Nanum:12"));
        Character c4 = new Character('l', "white", fontFactory.getFont("Nanum:12"));
        Character c5 = new Character('o', "white", fontFactory.getFont("Nanum:12"));
    }
}
