package me.kyungjun.pattern.abstractfactory.shipfactory;

import me.kyungjun.pattern.abstractfactory.ship.Ship;

/**
 * 공장에서 배를 만들때 공통적으로 실행되는 로직을 담은 중간 계층
 */
public abstract class DefaultShipFactory implements ShipFactory {

    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(email + " 님! 주문하신 "+ ship.getName() +" 준비되었습니다.");
    }
}
