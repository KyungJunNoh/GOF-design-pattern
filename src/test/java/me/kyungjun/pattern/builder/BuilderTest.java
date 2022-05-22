package me.kyungjun.pattern.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuilderTest {

    @Test
    void builder_jeju_테스트(){
        TourDirector tourDirector = new TourDirector(new DefaultTourBuilder());

        TourPlan tourPlan = tourDirector.jejuTrip();

        assertEquals(tourPlan.getTitle(),"제주도 여행");
    }
}
