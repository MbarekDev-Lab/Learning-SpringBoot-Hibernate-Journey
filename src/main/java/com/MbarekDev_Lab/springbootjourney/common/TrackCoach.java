package com.MbarekDev_Lab.springbootjourney.common;

import com.MbarekDev_Lab.springbootjourney.coach.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("trackCoach")
// @Scope("prototype") // Uncomment to test prototype scope behavior
public class TrackCoach implements Coach {

    public TrackCoach() {
        System.out.println("1. Constructor: TrackCoach");
    }

//    @PostConstruct
//    public void init() {
//        System.out.println("2. @PostConstruct: TrackCoach initialized");
//    }
//
//    @PreDestroy
//    public void cleanup() {
//        System.out.println("4. @PreDestroy: TrackCoach cleanup");
//    }

    @Override
    public String getDailyWorkout() {
        return "Run 5km daily.";
    }

}
