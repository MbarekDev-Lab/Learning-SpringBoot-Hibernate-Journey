package com.MbarekDev_Lab.springbootjourney.config;

import com.MbarekDev_Lab.springbootjourney.coach.Coach;
import com.MbarekDev_Lab.springbootjourney.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }

}
