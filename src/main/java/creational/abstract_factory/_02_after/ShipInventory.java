package creational.abstract_factory._02_after;

import creational.abstract_factory._02_after.factory.WhiteShipFactory;
import creational.abstract_factory._02_after.factory.WhiteShipPartsFactory;
import creational.abstract_factory._02_after.factory.WhiteShipPartsProFactory;
import creational.factory_method._02_after.factory.intf.ShipFactoryForAbst;
import creational.factory_method._02_after.model.Ship;

public class ShipInventory {
    public static void main(String[] args) {
        ShipFactoryForAbst shipFactory = new WhiteShipFactory(new WhiteShipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());

        ShipFactoryForAbst shipFactory2 = new WhiteShipFactory(new WhiteShipPartsProFactory());
        Ship ship2 = shipFactory2.createShip();
        System.out.println(ship2.getAnchor().getClass());
        System.out.println(ship2.getWheel().getClass());
    }
}
