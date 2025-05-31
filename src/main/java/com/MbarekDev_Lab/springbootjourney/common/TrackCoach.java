package com.MbarekDev_Lab.springbootjourney.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary  // or @Component @Component("trackCoach")
public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return " TrackCoach :";
    }
}
