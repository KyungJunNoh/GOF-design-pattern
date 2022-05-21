package me.kyungjun.pattern.singleton;

import me.kyungjun.pattern.singleton.spring.Human;
import me.kyungjun.pattern.singleton.spring.SpringConfig;
import me.kyungjun.pattern.singleton.sync.Settings;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {

    @Test
    void singleton_synchronized_테스트(){
        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();

        assertSame(settings1,settings2);
    }

    @Test
    void singleton_StaticInner_테스트(){
        me.kyungjun.pattern.singleton.inner.Settings settings1 = me.kyungjun.pattern.singleton.inner.Settings.getInstance();
        me.kyungjun.pattern.singleton.inner.Settings settings2 = me.kyungjun.pattern.singleton.inner.Settings.getInstance();

        assertSame(settings1,settings2);
    }

    @Test
    void singleton_Eager_Initialization_테스트(){
        me.kyungjun.pattern.singleton.eager.Settings settings1 = me.kyungjun.pattern.singleton.eager.Settings.getInstance();
        me.kyungjun.pattern.singleton.eager.Settings settings2 = me.kyungjun.pattern.singleton.eager.Settings.getInstance();

        assertSame(settings1,settings2);
    }

    @Test
    void singleton_Double_Check_테스트(){
        me.kyungjun.pattern.singleton.doubleCheck.Settings settings1 = me.kyungjun.pattern.singleton.doubleCheck.Settings.getInstance();
        me.kyungjun.pattern.singleton.doubleCheck.Settings settings2 = me.kyungjun.pattern.singleton.doubleCheck.Settings.getInstance();

        assertSame(settings1,settings2);
    }

    @Test
    void 리플렉션을_이용한_singleton_깨뜨리기_테스트() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings settings1 = Settings.getInstance(); // 정상적인 방법으로 만들어진 Settings

        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
        constructor.setAccessible(true);

        Settings settings2 = constructor.newInstance(); // 리플렉션으로 만든 Settings

        assertNotSame(settings1,settings2);
    }

    @Test
    void 역직렬화를_이용한_singleton_깨뜨리기_테스트() throws IOException, ClassNotFoundException {
        Settings settings1 = Settings.getInstance();
        Settings settings2;

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings1);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))){
            settings2 = (Settings) in.readObject();
        }

        assertNotSame(settings1,settings2);
    }

    @Test
    void 스프링_컨테이너_테스트() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        Human human1 = applicationContext.getBean("hello", Human.class);
        Human human2 = applicationContext.getBean("hello", Human.class);

        assertSame(human1,human2);
    }
}
