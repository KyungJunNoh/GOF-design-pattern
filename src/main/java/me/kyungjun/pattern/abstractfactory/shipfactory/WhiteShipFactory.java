package me.kyungjun.pattern.abstractfactory.shipfactory;

import me.kyungjun.pattern.abstractfactory.ship.Ship;
import me.kyungjun.pattern.abstractfactory.ship.WhiteShip;
import me.kyungjun.pattern.abstractfactory.partfactory.ShipPartsFactory;

/**
 * Concrete Creator
 * WhiteShip 을 만드는 Factory
 */
public class WhiteShipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip(String name) {
        Ship ship = new WhiteShip();

        ship.setName(name);
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());

        return ship;
    }
}
