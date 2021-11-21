package creational.abstract_factory.after.factory;

import creational.abstract_factory.common.model.parts.WhiteAnchor;
import creational.abstract_factory.common.model.parts.WhiteWheel;
import creational.abstract_factory.after.factory.intf.ShipPartsFactory;
import creational.abstract_factory.common.model.parts.intf.Anchor;
import creational.abstract_factory.common.model.parts.intf.Wheel;

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
