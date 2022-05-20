package me.kyungjun.pattern.factorymethod;

/**
 * Creator : 팩토리 메서드로 생성될 객체의 공통 인터페이스 ( 객체(Product)를 만들어내는 Creator 인터페이스 )
 * 새로 추가될 객체들이 공통적으로 가져야할 메소드들은 default 키워드를 사용하여 구현 해두고,
 * 바뀌어야 되는 부분( 구체적으로 구현해야할 부분 ) 은 미리 선언 해두어 하위 클래스가 implements 하여 구현할 수 있도록 한다.
 */
public interface ShipFactory {

    // default Method : interface 에서도 기본적인 구현을 할 수 있게 해주는 키워드 이다.
    // ( 자바 8 이전 버전은 abstract 클래스 을 사용했지만 default 메소드가 생긴 후 부터 interface 를 더 사용하는 편이다.)
    default Ship orderShip(String name, String email){
        validate(name,email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }

    private void validate(String name, String email) {
        if (name == null) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }

    private void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    Ship createShip();

    private void sendEmailTo(String email, Ship ship){
        System.out.println(email + " 님 에게 도착한 메세지 : " + ship.getName() + " 다 만들었습니다.");
    }
}
