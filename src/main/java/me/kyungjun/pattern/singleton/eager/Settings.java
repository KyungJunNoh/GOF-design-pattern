package me.kyungjun.pattern.singleton.eager;

/**
 * 이른 초기화(Eager initialization)
 * 클래스가 로딩되는 시점에 필드를 선언과 동시에 초기화 하여 항상 같은 객체를 반환
 * 멀티스레드 환경에서도 스레드로 인한 다른 객체가 발생하지 않음.
 * 하지만 쓰이지 않으면 안스인 객체를 생성하는것이므로 리소스 낭비가 생길 수 있음.
 */
public class Settings {

    private static final Settings INSTANCE = new Settings();

    private Settings() {}

    public static Settings getInstance(){
        return INSTANCE;
    }
}