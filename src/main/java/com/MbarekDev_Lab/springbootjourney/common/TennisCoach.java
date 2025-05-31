package com.MbarekDev_Lab.springbootjourney.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "TennisCoach";
    }
}
