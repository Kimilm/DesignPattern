package creational.factory_method._02_after.factory;

import creational.factory_method._02_after.factory.intf.ShipFactory;
import creational.factory_method._02_after.model.Ship;
import creational.factory_method._02_after.model.WhiteShip;

public class WhiteShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
