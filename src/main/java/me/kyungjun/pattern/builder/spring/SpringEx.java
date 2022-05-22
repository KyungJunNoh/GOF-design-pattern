package me.kyungjun.pattern.builder.spring;

import lombok.Builder;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * 스프링에서 사용되는 Builder 패턴 Example
 */
@Builder // lombok 에서 지원
public class SpringEx {

    private String title;
    private int nights;
    private int days;

    public static void main(String[] args) {
        SpringEx trip = SpringEx.builder()
                .title("여행")
                .nights(2)
                .days(3)
                .build();

        // 스프링에서 지원하는 Uri 를 Builder 패턴으로 만들 수 있음
        UriComponents google = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("www.google.com")
                .path("KyungJunNoh")
                .build().encode();

        System.out.println(google);
    }
}
