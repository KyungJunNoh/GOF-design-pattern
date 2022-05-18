package me.kyungjun.pattern.singleton.sync;

import java.io.Serializable;

/**
 *  동기화(synchronized)
 *  Lock 을 사용하여 스레드가 동시에 실행되지 않도록 한다. 하지만 성능 부하가 생길 수 있다.
 */
public class Settings implements Serializable { // 해당 클래스를 직렬화 ( 역직렬화를 이용한 싱글톤 깨뜨리기에서 사용하기 위함 )

    private static Settings instance;

    // 외부에서 생성자를 사용하지 못하게 private 키워드 사용
    private Settings() {}

    // synchronized 키워드를 사용하여 스레드가 동시에 접근하지 못하게 설정
    public static synchronized Settings getInstance(){
        if (instance == null){
            instance = new Settings();
        }

        return instance;
    }

    // 역직렬화를 이용하여 싱글톤 패턴을 깨뜨릴때 방지를 할 수 있는 방법이 있다.
    // 아래 메소드는 역직렬화를 할때 호출이 되는데 이때 getInstance(); 를 호출해주면
    // 역직렬화를 이용한 싱글톤깨뜨리기를 방지할 수 있다.
    /*
    protected Object readResolve() {
        return getInstance();
    }
    */

}
