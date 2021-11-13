package creational.factory_method._01_before;

public class ShipFactory {
    public static Ship orderShip(String name, String email) {
        //validate
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("배 이름을 지어주세요");
        }

        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("이메일을 남겨주세요");
        }

        prepareFor(name);

        Ship ship = new Ship();
        ship.setName(name);

        // name
        if (name.equalsIgnoreCase("whiteShip")) {
            ship.setLogo("\uD83D\uDEE5");
        } else if (name.equalsIgnoreCase("blackShip")) {
            ship.setLogo("⚓");
        }

        // color
        if (name.equalsIgnoreCase("whiteShip")) {
            ship.setColor("while");
        } else if (name.equalsIgnoreCase("blackShip")) {
            ship.setColor("black");
        }

        // notify
        sendEmailTo(email, ship);

        return ship;
    }

    private static void prepareFor(String name) {
        System.out.println(name + "만들 준비중");
    }

    public static void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 건조를 완료했습니다.");
    }
}
