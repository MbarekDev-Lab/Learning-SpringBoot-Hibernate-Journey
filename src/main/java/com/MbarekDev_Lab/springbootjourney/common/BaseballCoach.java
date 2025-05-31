package com.MbarekDev_Lab.springbootjourney.common;

import com.MbarekDev_Lab.springbootjourney.core.Coach;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    public BaseballCoach() {
        System.out.println("in constructor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return " BaseballCoach :";
    }
}
