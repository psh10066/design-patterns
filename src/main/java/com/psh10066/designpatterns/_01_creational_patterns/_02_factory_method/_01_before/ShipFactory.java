package com.psh10066.designpatterns._01_creational_patterns._02_factory_method._01_before;

import com.psh10066.designpatterns._01_creational_patterns._02_factory_method._00_common.Ship;
import org.springframework.util.StringUtils;

public class ShipFactory {

    public static Ship orderShip(String name, String email) {
        // validate
        if (!StringUtils.hasText(name)) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (!StringUtils.hasText(email)) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }

        prepareFor(name);

        Ship ship = new Ship();
        ship.setName(name);

        // Customizing for specific name
        if (name.equalsIgnoreCase("whiteship")) {
            ship.setLogo("\uD83D\uDEE5");
        } else if (name.equalsIgnoreCase("blackship")) {
            ship.setLogo("⚓");
        }

        // coloring
        if (name.equalsIgnoreCase("whiteship")) {
            ship.setColor("white");
        } else if (name.equalsIgnoreCase("blackship")) {
            ship.setColor("black");
        }

        // notify
        sendEmailTo(email, ship);

        return ship;
    }

    private static void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    private static void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }
}
