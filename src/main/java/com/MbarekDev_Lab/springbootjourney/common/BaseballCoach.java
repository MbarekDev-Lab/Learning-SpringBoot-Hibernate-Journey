package com.MbarekDev_Lab.springbootjourney.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return " BaseballCoach :";
    }
}
