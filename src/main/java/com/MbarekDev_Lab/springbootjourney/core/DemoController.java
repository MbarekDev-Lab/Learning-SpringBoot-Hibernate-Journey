package com.MbarekDev_Lab.springbootjourney.core;

import outerpackge.utils.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach coach;

    /*@Autowired // define an constructor for dependency injection
    public DemoController(Coach coach) {
        this.coach = coach;
    }*/

    @GetMapping("/dailytraining")
    public String getDailytraining() {
        return coach.getDailyWorkout();
    }

    @Autowired
    public void setCoach(Coach coach) {
        this.coach = coach;
    }
}
