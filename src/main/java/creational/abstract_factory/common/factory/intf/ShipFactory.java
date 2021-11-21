package creational.abstract_factory.common.factory.intf;

import creational.abstract_factory.common.model.ship.Ship;

public interface ShipFactory {
    // interface라서 굳이 public을 붙이지 않아도 됨
    Ship orderShip(String name, String email);

    Ship createShip();
}
