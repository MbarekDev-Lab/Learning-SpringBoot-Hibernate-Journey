package com.MbarekDev_Lab.springbootjourney.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return " TrackCoach :";
    }
}
