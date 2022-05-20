package me.kyungjun.pattern.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryMethodTest {

    @Test
    void factoryMethod_blackShip_테스트(){
        Ship ship = new BlackShipFactory().orderShip("경준 호", "developerjun0615@gmail.com");

        assertEquals(ship.getName(),"blackShip");
    }

    @Test
    void factoryMethod_whiteShip_테스트(){
        Ship ship = new WhiteShipFactory().orderShip("경준 호", "developerjun0615@gmail.com");

        assertEquals(ship.getName(),"whiteShip");
    }
}
