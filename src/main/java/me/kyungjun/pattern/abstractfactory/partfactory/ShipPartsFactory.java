package me.kyungjun.pattern.abstractfactory.partfactory;

import me.kyungjun.pattern.abstractfactory.part.Wheel;
import me.kyungjun.pattern.abstractfactory.part.Anchor;

/**
 * Creator
 * ShipParts 의 행동의 공통점을 가진 추상화 팩토리
 */
public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();
}
