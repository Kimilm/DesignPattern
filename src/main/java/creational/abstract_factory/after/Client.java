package creational.abstract_factory.after;

import creational.abstract_factory.after.factory.WhiteShipFactory;
import creational.abstract_factory.after.factory.WhiteShipPartsFactory;
import creational.abstract_factory.after.factory.WhiteShipPartsProFactory;
import creational.abstract_factory.common.factory.intf.ShipFactory;
import creational.abstract_factory.common.model.ship.Ship;

public class Client {
    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());

        ShipFactory shipFactory2 = new WhiteShipFactory(new WhiteShipPartsProFactory());
        Ship ship2 = shipFactory2.createShip();
        System.out.println(ship2.getAnchor().getClass());
        System.out.println(ship2.getWheel().getClass());
    }
}
