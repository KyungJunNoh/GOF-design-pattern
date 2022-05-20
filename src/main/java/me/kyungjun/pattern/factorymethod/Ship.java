package me.kyungjun.pattern.factorymethod;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Product : 새로운 객체를 만들어야되는 객체의 공통점을 가진 인터페이스 (클래스, 팩토리 메서드)
 */
@ToString
@Setter
@Getter
public class Ship {

    private String name;
    private String Logo;
    private String color;
}
