package com.MbarekDev_Lab.springbootjourney.common;

import com.MbarekDev_Lab.springbootjourney.coach.Coach;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements Coach {
    public TennisCoach() {
        System.out.println("in constructor : " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "TennisCoach";
    }
}
