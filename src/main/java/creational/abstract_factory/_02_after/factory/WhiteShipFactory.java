package creational.abstract_factory._02_after.factory;

import creational.abstract_factory._02_after.factory.intf.ShipPartsFactory;
import creational.factory_method._02_after.factory.abst.DefaultShipFactory;
import creational.factory_method._02_after.model.Ship;
import creational.factory_method._02_after.model.WhiteShip;

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
