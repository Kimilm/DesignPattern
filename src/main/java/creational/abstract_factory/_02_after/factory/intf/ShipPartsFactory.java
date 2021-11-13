package creational.abstract_factory._02_after.factory.intf;

import creational.abstract_factory._02_after.model.intf.Anchor;
import creational.abstract_factory._02_after.model.intf.Wheel;

//추상 팩토리
public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();
}
