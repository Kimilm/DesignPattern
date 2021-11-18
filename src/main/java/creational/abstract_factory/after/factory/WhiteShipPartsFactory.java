package creational.abstract_factory.after.factory;

import creational.abstract_factory.before.WhiteAnchor;
import creational.abstract_factory.before.WhiteWheel;
import creational.abstract_factory.after.factory.intf.ShipPartsFactory;
import creational.abstract_factory.before.model.intf.Anchor;
import creational.abstract_factory.before.model.intf.Wheel;

public class WhiteShipPartsFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
