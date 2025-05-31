package com.MbarekDev_Lab.springbootjourney.common;

import com.MbarekDev_Lab.springbootjourney.coach.Coach;


public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("1. Constructor: SwimCoach" + getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return " Swim 1000 meters as a warm up";
    }
}
