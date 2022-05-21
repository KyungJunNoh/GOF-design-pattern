package me.kyungjun.pattern.factorymethod.aws;

public class T2MediumEC2 extends EC2{

    public T2MediumEC2(Long id, String name) {
        setInstanceId(id);
        setType(Type.T2MEDIUM);
        setName(name);
    }
}
