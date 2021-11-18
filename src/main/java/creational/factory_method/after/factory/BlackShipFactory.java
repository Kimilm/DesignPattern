package creational.factory_method.after.factory;

import creational.factory_method.after.factory.intf.ShipFactory;
import creational.factory_method.after.model.BlackShip;
import creational.factory_method.after.model.Ship;

public class BlackShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
