package com.MbarekDev_Lab.springbootjourney.common;

import com.MbarekDev_Lab.springbootjourney.core.Coach;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CricketCoach implements Coach {
    
    public CricketCoach() {
        System.out.println("in constructor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "CricketCoach";
    }
}
