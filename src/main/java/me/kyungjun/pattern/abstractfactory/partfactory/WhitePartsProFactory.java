package me.kyungjun.pattern.abstractfactory.partfactory;

import me.kyungjun.pattern.abstractfactory.part.WhiteWheelPro;
import me.kyungjun.pattern.abstractfactory.part.Anchor;
import me.kyungjun.pattern.abstractfactory.part.Wheel;
import me.kyungjun.pattern.abstractfactory.part.WhiteAnchorPro;

/**
 * Concrete Creator
 * WhiteParts 를 장착할 수 있게하는 WhitePartsProFactory 추상화 팩토리
 */
public class WhitePartsProFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheelPro();
    }
}
