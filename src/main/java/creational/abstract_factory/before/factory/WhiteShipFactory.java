package creational.abstract_factory.before.factory;

import creational.abstract_factory.after.factory.abst.DefaultShipFactory;
import creational.abstract_factory.before.model.Ship;
import creational.abstract_factory.before.model.WhiteAnchor;
import creational.abstract_factory.before.model.WhiteShip;
import creational.abstract_factory.before.model.WhiteWheel;

public class WhiteShipFactory extends DefaultShipFactory {

    // 화이트 앵커 화이트 휠이 새로 추가된다면 코드가 변경되어야 함
    // 개선된 앵커, 개선된 휠 제품이 추가된다면 advencedAnchor
    // 앵커 프로, 휠 프로..
    // 코드를 바꾸지 않고도 제품군을 늘릴 수 있는 방법
    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());

        return ship;
    }
}
