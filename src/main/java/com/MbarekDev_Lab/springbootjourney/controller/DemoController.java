package com.MbarekDev_Lab.springbootjourney.controller;

import com.MbarekDev_Lab.springbootjourney.coach.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

  private final Coach coach;

  @Autowired
  public DemoController(@Qualifier("trackCoach") Coach coach) {
    System.out.println("in constructor : DemoController");
    this.coach = coach;
  }

  @GetMapping("/dailytraining")
  public String getDailyTraining() {
    return coach.getDailyWorkout();
  }
}
