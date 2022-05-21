package me.kyungjun.pattern.abstractfactory;

import me.kyungjun.pattern.abstractfactory.part.WhiteAnchor;
import me.kyungjun.pattern.abstractfactory.part.WhiteAnchorPro;
import me.kyungjun.pattern.abstractfactory.part.WhiteWheel;
import me.kyungjun.pattern.abstractfactory.part.WhiteWheelPro;
import me.kyungjun.pattern.abstractfactory.partfactory.WhitePartsFactory;
import me.kyungjun.pattern.abstractfactory.partfactory.WhitePartsProFactory;
import me.kyungjun.pattern.abstractfactory.ship.Ship;
import me.kyungjun.pattern.abstractfactory.shipfactory.ShipFactory;
import me.kyungjun.pattern.abstractfactory.shipfactory.WhiteShipFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbstractFactoryTest {

    @Test
    void abstractFactory_whiteShip_normalParts_테스트(){
        ShipFactory shipFactory = new WhiteShipFactory(new WhitePartsFactory());
        Ship whiteShip = shipFactory.orderShip("경준 호", "develoerjun0615@gmail.com");

        assertEquals(whiteShip.getAnchor().getClass(), WhiteAnchor.class);
        assertEquals(whiteShip.getWheel().getClass(), WhiteWheel.class);
    }

    @Test
    void abstractFactory_whiteShip_proParts_테스트(){
        ShipFactory shipFactory = new WhiteShipFactory(new WhitePartsProFactory());
        Ship whiteShip = shipFactory.orderShip("경준 호", "develoerjun0615@gmail.com");

        assertEquals(whiteShip.getAnchor().getClass(), WhiteAnchorPro.class);
        assertEquals(whiteShip.getWheel().getClass(), WhiteWheelPro.class);
    }
}
