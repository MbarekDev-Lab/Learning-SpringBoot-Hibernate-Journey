package com.MbarekDev_Lab.springbootjourney.common;

import com.MbarekDev_Lab.springbootjourney.core.Coach;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TrackCoach implements Coach {
    public TrackCoach() {
        System.out.println("in constructor @Lazy: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return " TrackCoach :";
    }
}
