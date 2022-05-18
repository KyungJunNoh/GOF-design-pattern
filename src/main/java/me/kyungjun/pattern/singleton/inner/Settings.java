package me.kyungjun.pattern.singleton.inner;

/**
 * static inner 클래스
 * getInstance 가 호출 될때 SettingHolder class 도 생성되기 때문에
 * 멀티 스레드 환경에서도 안전(thread-safe) 하고 LAZY 한 코드이다.
 */
public class Settings {

    private Settings() {}

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance(){
        return SettingsHolder.INSTANCE;
    }
}
