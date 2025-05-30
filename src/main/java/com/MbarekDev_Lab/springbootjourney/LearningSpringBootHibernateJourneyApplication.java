package com.MbarekDev_Lab.springbootjourney;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.MbarekDev_Lab.springbootjourney", "outerpackge.utils"})
public class LearningSpringBootHibernateJourneyApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningSpringBootHibernateJourneyApplication.class, args);
    }

}
