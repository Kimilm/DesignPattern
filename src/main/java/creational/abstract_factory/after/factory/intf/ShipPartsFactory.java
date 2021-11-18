package creational.abstract_factory.after.factory.intf;

import creational.abstract_factory.before.model.intf.Anchor;
import creational.abstract_factory.before.model.intf.Wheel;

//추상 팩토리
public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();
}
