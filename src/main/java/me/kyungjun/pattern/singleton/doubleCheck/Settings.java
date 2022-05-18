package me.kyungjun.pattern.singleton.doubleCheck;

/**
 * double checked locking
 * 두개의 스레드가 getInstance 동시에 접근 하더라도
 * synchronized 키워드로 인하여 두개의 스레드가 동시에 접근하지 못하게 함.
 */
public class Settings {

    private static volatile Settings instance;

    private Settings() {}

    public static Settings getInstance(){
        if(instance == null) { // 객체가 생성되지 않았을때,
            synchronized (Settings.class) { // 두개의 스레드가 같이 접근을 하더라도 synchronized 키워드로 인해 한개의 스레드는 대기를 하고있어야함.
                if (instance == null) {
                    instance = new Settings();
                }
            }
        }

        return instance;
    }
}
