package creational.factory_method._02_after;

import creational.factory_method._02_after.factory.BlackShipFactory;
import creational.factory_method._02_after.factory.WhiteShipFactory;
import creational.factory_method._02_after.model.Ship;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteShip = new WhiteShipFactory().orderShip("whiteShip", "kimilm@email.com");
        System.out.println(whiteShip);

        // 새로운 배를 생성하는 기능이 추가되었을 때 기존의 코드에 변경이 있으면 안 됨
        Ship blackShip = new BlackShipFactory().orderShip("blackShip", "kimilm@email.com");
        System.out.println(blackShip);
    }
}
