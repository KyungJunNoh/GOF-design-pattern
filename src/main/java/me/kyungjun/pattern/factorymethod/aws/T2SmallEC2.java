package me.kyungjun.pattern.factorymethod.aws;

public class T2SmallEC2 extends EC2{

    public T2SmallEC2(Long id,String name){
        setInstanceId(id);
        setType(Type.T2SMALL);
        setName(name);
    }
}
