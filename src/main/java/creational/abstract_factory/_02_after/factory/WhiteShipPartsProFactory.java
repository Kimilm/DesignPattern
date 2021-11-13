package creational.abstract_factory._02_after.factory;

import creational.abstract_factory._02_after.factory.intf.ShipPartsFactory;
import creational.abstract_factory._02_after.model.WhiteAnchorPro;
import creational.abstract_factory._02_after.model.WhiteWheelPro;
import creational.abstract_factory._02_after.model.intf.Anchor;
import creational.abstract_factory._02_after.model.intf.Wheel;

public class WhiteShipPartsProFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheelPro();
    }
}
