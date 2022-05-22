package me.kyungjun.pattern.builder.java;

import java.util.stream.Stream;

/**
 * 자바에서 사용되는 Builder 패턴 Example
 */
public class JavaEx {

    public static void main(String[] args) {
        // StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        String name = stringBuilder.append("Noh").append("KyungJun").toString();

        System.out.println(name);

        // StreamBuilder
        Stream.Builder<String> streamBuilder = Stream.builder();
        Stream<String> name2 = streamBuilder.add("Noh").add("KyungJun").build();

        name2.forEach(System.out::println);
    }
}
