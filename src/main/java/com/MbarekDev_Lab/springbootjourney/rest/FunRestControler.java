package com.MbarekDev_Lab.springbootjourney.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestControler {
    //inject properties for coach.name & team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    //expose new endPoint for "teaminfo
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return  "Coach : "+coachName+", Team name: "+teamName;
    }

    @GetMapping("/")
    public String sayHello() {
        return "hello Mbarek";
    }

    // Exposing 2 endpoints beneath base path '/actuator'
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "run a hard 4k";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day .";
    }


}
