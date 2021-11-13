package creational.factory_method._02_after;

import creational.factory_method._02_after.factory.BlackShipFactory;
import creational.factory_method._02_after.factory.WhiteShipFactory;
import creational.factory_method._02_after.factory.intf.ShipFactory;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteShip", "kimilm@email.com");
        client.print(new BlackShipFactory(), "blackShip", "kimilm@email.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
