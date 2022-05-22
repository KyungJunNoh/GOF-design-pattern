package me.kyungjun.pattern.builder;

import java.time.LocalDate;

/**
 * TourDirector 을 사용 함으로써 builder 의 내용을 감출 수 있다.
 * 동일한 프로세스의 집합
 */
public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan jejuTrip(){
        return tourPlanBuilder.title("제주도 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2022, 05, 22))
                .whereToStay("베네치아 호텔")
                .addPlan(1, "체크인 하고 짐 풀기")
                .addPlan(1, "석식")
                .addPlan(2, "조식")
                .addPlan(2, "올렛길 산책")
                .addPlan(2, "점심 - 메뉴 흑돼지")
                .addPlan(2, "넥슨 박물관 관람 & 체험")
                .addPlan(2, "바닷가 주변 스타벅스 에서 커피 한잔")
                .addPlan(2, "석식")
                .addPlan(2, "호텔 스파")
                .addPlan(3, "조식")
                .addPlan(3, "체크아웃")
                .addPlan(3, "기념품 구매")
                .addPlan(3, "여행 끝 (집)")
                .getPlan();
    }

}
