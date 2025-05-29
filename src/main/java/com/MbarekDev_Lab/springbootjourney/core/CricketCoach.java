package com.MbarekDev_Lab.springbootjourney.core;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice Java every day!!!!!!";
    }
}
