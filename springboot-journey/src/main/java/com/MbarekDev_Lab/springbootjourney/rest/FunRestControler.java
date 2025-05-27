package com.MbarekDev_Lab.springbootjourney.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestControler {

    @GetMapping("/")
    public String sayHello() {
        return "hello Mbarek";
    }

}
