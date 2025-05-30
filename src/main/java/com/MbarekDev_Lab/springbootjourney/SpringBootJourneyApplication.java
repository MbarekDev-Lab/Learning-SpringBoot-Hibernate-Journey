package com.MbarekDev_Lab.springbootjourney;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ComponentScan(lazyInit = true) //Make all beans lazy by default
//@SpringBootApplication(scanBasePackages = {"com.MbarekDev_Lab.springbootjourney", "outerpackge.utils"})
@SpringBootApplication
public class SpringBootJourneyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJourneyApplication.class, args);
    }

}
