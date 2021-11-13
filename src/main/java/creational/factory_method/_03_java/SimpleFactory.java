package creational.factory_method._03_java;

import creational.factory_method._02_after.model.BlackShip;
import creational.factory_method._02_after.model.WhiteShip;

public class SimpleFactory {
    // java.util.Calendar 가 이런 팩토리로 작성되어있다
    // 입력값에 따라 다른 인스턴스를 반환한다
    public Object createProduct(String name) {
        if (name.equals("whiteShip")) {
            return new WhiteShip();
        } else if (name.equals("blackShip")) {
            return new BlackShip();
        }

        throw new IllegalArgumentException();
    }
}
