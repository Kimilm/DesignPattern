package creational.abstract_factory.after.factory;

import creational.abstract_factory.after.factory.intf.ShipPartsFactory;
import creational.abstract_factory.after.model.WhiteAnchorPro;
import creational.abstract_factory.after.model.WhiteWheelPro;
import creational.abstract_factory.before.model.intf.Anchor;
import creational.abstract_factory.before.model.intf.Wheel;

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