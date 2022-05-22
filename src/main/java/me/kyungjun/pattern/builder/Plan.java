package me.kyungjun.pattern.builder;

public class Plan {

    public static void main(String[] args) {
        TourDirector tourDirector = new TourDirector(new DefaultTourBuilder());

        TourPlan tourPlan = tourDirector.jejuTrip();

        System.out.println(tourPlan.getPlans().toString());
    }
}
