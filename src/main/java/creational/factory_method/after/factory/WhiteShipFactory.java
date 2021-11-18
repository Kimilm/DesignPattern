package creational.factory_method.after.factory;

import creational.factory_method.after.factory.intf.ShipFactory;
import creational.factory_method.after.model.Ship;
import creational.factory_method.after.model.WhiteShip;

public class WhiteShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
