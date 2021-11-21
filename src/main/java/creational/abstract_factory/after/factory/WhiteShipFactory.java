package creational.abstract_factory.after.factory;

import creational.abstract_factory.common.factory.abst.DefaultShipFactory;
import creational.abstract_factory.common.factory.intf.ShipPartsFactory;
import creational.abstract_factory.common.model.ship.Ship;
import creational.abstract_factory.common.model.ship.WhiteShip;

public class WhiteShipFactory extends DefaultShipFactory {

    private final ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());

        return ship;
    }
}
