package creational.abstract_factory._02_after;

//추상 팩토리
public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();
}
