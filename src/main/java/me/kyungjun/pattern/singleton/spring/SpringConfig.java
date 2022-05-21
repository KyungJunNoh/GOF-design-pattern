package me.kyungjun.pattern.singleton.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Bean을 관리하는 Config 클래스
 */
@Configuration
public class SpringConfig {

    @Bean
    public Human hello(){
        return new Human();
    }
}
