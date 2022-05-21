package me.kyungjun.pattern.abstractfactory.ship;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import me.kyungjun.pattern.abstractfactory.part.Anchor;
import me.kyungjun.pattern.abstractfactory.part.Wheel;

/**
 * Product
 * Ship 의 특징을 정의한 클래스
 */
@ToString
@Setter
@Getter
public class Ship {

    private String name;
    private Anchor anchor;
    private Wheel wheel;
}
