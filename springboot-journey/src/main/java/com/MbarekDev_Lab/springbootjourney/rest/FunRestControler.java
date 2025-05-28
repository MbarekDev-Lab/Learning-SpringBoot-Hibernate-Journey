package com.MbarekDev_Lab.springbootjourney.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestControler {

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
