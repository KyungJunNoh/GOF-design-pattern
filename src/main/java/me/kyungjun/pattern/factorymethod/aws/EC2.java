package me.kyungjun.pattern.factorymethod.aws;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 개인적으로 복습하기 위해 만들어본 AWS EC2 구조를 간단히 팩토리 메소드 패턴으로 구현
 */
@ToString
@Getter
@Setter
public class EC2 {

    private Long instanceId;
    private String name;
    private Type type;

}
