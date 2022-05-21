package me.kyungjun.pattern.factorymethod.aws;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 개인적으로 복습하기 위해 만들어본 AWS EC2 구조를 간단히 팩토리 메소드 패턴으로 구현
 */
public class FactoryMethodWithAWSTest {

    @Test
    void factoryMethod_T2Micro_테스트() {
        EC2 t2Micro_EC2 = new T2MicroEc2Factory().addEC2(1L, "Spring boot T2Micro EC2");

        assertEquals(t2Micro_EC2.getType(),Type.T2MICRO);
    }

    @Test
    void factoryMethod_T2Small_테스트() {
        EC2 t2Micro_EC2 = new T2SmallEC2Factory().addEC2(1L, "Spring boot T2Small EC2");

        assertEquals(t2Micro_EC2.getType(),Type.T2SMALL);
    }

    @Test
    void factoryMethod_T2Medium_테스트() {
        EC2 t2Micro_EC2 = new T2MediumEC2Factory().addEC2(1L, "Spring boot T2Small EC2");

        assertEquals(t2Micro_EC2.getType(),Type.T2MEDIUM);
    }

}
