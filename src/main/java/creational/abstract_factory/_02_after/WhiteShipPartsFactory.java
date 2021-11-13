package creational.abstract_factory._02_after;

import creational.abstract_factory._01_before.WhiteAnchor;
import creational.abstract_factory._01_before.WhiteWheel;

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
