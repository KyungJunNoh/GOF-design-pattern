package me.kyungjun.pattern.factorymethod.aws;

public interface EC2Factory {

    private void validate(String name){
        if(name == null) throw new IllegalArgumentException("name 을 입력해주세요");
    }

    default EC2 addEC2(Long id,String name) {
        validate(name);
        return createEC2(id,name);
    }

    EC2 createEC2(Long id,String name);
}
