package creational.abstract_factory.after.factory;

import creational.abstract_factory.common.factory.intf.ShipPartsFactory;
import creational.abstract_factory.common.model.parts.WhiteAnchorPro;
import creational.abstract_factory.common.model.parts.WhiteWheelPro;
import creational.abstract_factory.common.model.parts.intf.Anchor;
import creational.abstract_factory.common.model.parts.intf.Wheel;

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
