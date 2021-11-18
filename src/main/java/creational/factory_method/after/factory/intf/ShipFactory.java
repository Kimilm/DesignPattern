package creational.factory_method.after.factory.intf;

import creational.factory_method.after.model.Ship;

public interface ShipFactory {
    // interface라서 굳이 public을 붙이지 않아도 됨
    // 주석이 없어도 코드의 흐름이 보임
    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);

        Ship ship = createShip();

        sendEmailTo(email, ship);

        return ship;
    }

    // default가 아님 -> 하위클래스가 구현해야 함
    Ship createShip();

    // java 9+ private 가능
    default void validate(String name, String email) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("배 이름을 지어주세요");
        }

        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("이메일을 남겨주세요");
        }
    }

    default void prepareFor(String name) {
        System.out.println(name + " 만들 준비중");
    }

    default void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 건조를 완료했습니다.");
    }
}
