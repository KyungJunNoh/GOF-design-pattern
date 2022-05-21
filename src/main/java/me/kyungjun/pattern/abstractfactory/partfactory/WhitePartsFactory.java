package me.kyungjun.pattern.abstractfactory.partfactory;

import me.kyungjun.pattern.abstractfactory.part.WhiteWheel;
import me.kyungjun.pattern.abstractfactory.part.Anchor;
import me.kyungjun.pattern.abstractfactory.part.Wheel;
import me.kyungjun.pattern.abstractfactory.part.WhiteAnchor;

/**
 * Concrete Creator
 * WhiteParts 를 장착할 수 있게하는 WhitePartsFactory 추상화 팩토리
 */
public class WhitePartsFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
