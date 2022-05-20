package me.kyungjun.pattern.factorymethod;

/**
 * ConcreteProduct : Ship(Product) 을 상속(extends) 받은 클래스 이다. ( 새로운 객체 (Product 의 성질을 가진 새로운 객체) )
 */
public class WhiteShip extends Ship{

    public WhiteShip(){
        setName("whiteShip");
        setLogo("WHITE_LOGO");
        setColor("white");
    }
}
