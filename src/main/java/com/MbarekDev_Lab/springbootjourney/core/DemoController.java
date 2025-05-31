package com.MbarekDev_Lab.springbootjourney.core;

import com.MbarekDev_Lab.springbootjourney.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //@Autowired
    private final Coach coach;

    // Constructor injection (preferred)
    @Autowired // define a constructor for dependency injection
    public DemoController(@Qualifier("trackCoach") Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/dailytraining")
    public String getDailytraining() {
        return coach.getDailyWorkout();
    }

//    @Autowired // Setter Injection (when you need to inject optional dependencies)
//    public void setCoach(Coach coach) {
//        this.coach = coach;
//    }
}
