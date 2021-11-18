package creational.factory_method.before;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteShip = ShipFactory.orderShip("whiteShip", "kimilm@email.com");
        System.out.println(whiteShip);

        Ship blackShip = ShipFactory.orderShip("blackShip", "kimilm@email.com");
        System.out.println(blackShip);
    }
}
