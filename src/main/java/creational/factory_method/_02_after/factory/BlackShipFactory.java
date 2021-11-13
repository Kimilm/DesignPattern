package creational.factory_method._02_after.factory;

import creational.factory_method._02_after.factory.intf.ShipFactory;
import creational.factory_method._02_after.model.BlackShip;
import creational.factory_method._02_after.model.Ship;

public class BlackShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
