package creational.factory_method._02_after.factory.abst;

import creational.factory_method._02_after.factory.intf.ShipFactoryForAbst;
import creational.factory_method._02_after.model.Ship;

// Java 8의 경우 implement 내에서 private 키워드가 사용이 불가능
// 중간에 추상 클래스를 하나 더 두면 된다
public abstract class DefaultShipFactory implements ShipFactoryForAbst {
    public Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);

        Ship ship = createShip();

        sendEmailTo(email, ship);

        return ship;
    }

    private void validate(String name, String email) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("배 이름을 지어주세요");
        }

        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("이메일을 남겨주세요");
        }
    }

    private void prepareFor(String name) {
        System.out.println(name + " 만들 준비중");
    }

    private void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 건조를 완료했습니다.");
    }
}
