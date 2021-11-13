package creational.abstract_factory._02_after.factory;

import creational.abstract_factory._01_before.WhiteAnchor;
import creational.abstract_factory._01_before.WhiteWheel;
import creational.abstract_factory._02_after.factory.intf.ShipPartsFactory;
import creational.abstract_factory._02_after.model.intf.Anchor;
import creational.abstract_factory._02_after.model.intf.Wheel;

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
