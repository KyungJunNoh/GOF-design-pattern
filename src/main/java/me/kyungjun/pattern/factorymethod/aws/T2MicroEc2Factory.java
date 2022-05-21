package me.kyungjun.pattern.factorymethod.aws;

public class T2MicroEc2Factory implements EC2Factory{
    @Override
    public EC2 createEC2(Long id, String name) {
        return new T2MicroEC2(id, name);
    }
}
