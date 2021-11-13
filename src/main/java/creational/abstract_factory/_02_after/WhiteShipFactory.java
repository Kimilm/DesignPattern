package creational.abstract_factory._02_after;

import creational.abstract_factory._01_before.WhiteAnchor;
import creational.abstract_factory._01_before.WhiteWheel;
import creational.factory_method._02_after.factory.abst.DefaultShipFactory;
import creational.factory_method._02_after.model.Ship;
import creational.factory_method._02_after.model.WhiteShip;

public class WhiteShipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

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
