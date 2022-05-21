package me.kyungjun.pattern.abstractfactory;

import me.kyungjun.pattern.abstractfactory.partfactory.WhitePartsProFactory;
import me.kyungjun.pattern.abstractfactory.ship.Ship;
import me.kyungjun.pattern.abstractfactory.shipfactory.ShipFactory;
import me.kyungjun.pattern.abstractfactory.shipfactory.WhiteShipFactory;

/**
 * AbstractFactory pattern 을 사용해보는 클래스
 */
public class ShipInventory {

    public static void main(String[] args) {
        // WhiteShipFactory 에서 WhitePartsPro 공장을 주입하여 부품을 Pro 버전으로 장착
        // ( normal 버전으로 바꾸고싶다면 주입하는 Parts 팩토리를 변경하면 된다. -> 여기서 팩토리 메소드 패턴과의 차이점이 드러남. )
        ShipFactory shipFactory = new WhiteShipFactory(new WhitePartsProFactory());
        Ship ship = shipFactory.orderShip("경준 호","developerjun0615@gmail.com"); // 배를 주문

        // 배의 부품 타입을 확인
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
