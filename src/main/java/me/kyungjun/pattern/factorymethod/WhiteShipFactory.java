package me.kyungjun.pattern.factorymethod;

/**
 * ConcreteCreator : Creator(ShipFactory) 를 구현한 클래스로 새로운 객체(ConcreteProduct, WhiteShip)를 만드는 구현 클래스
 */
public class WhiteShipFactory implements ShipFactory{

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
