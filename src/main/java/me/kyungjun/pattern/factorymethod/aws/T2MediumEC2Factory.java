package me.kyungjun.pattern.factorymethod.aws;

public class T2MediumEC2Factory implements EC2Factory{
    @Override
    public EC2 createEC2(Long id, String name) {
        return new T2MediumEC2(id,name);
    }
}
