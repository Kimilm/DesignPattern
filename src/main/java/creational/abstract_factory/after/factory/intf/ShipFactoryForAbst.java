package creational.abstract_factory.after.factory.intf;

import creational.abstract_factory.before.model.Ship;

public interface ShipFactoryForAbst {
    // interface라서 굳이 public을 붙이지 않아도 됨
    Ship orderShip(String name, String email);

    Ship createShip();
}
