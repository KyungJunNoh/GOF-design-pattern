package me.kyungjun.pattern.factorymethod.aws;

public class T2MicroEC2 extends EC2 {

    public T2MicroEC2(Long id, String name){
        setInstanceId(id);
        setType(Type.T2MICRO);
        setName(name);
    }
}
