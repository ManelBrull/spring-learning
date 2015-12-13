package com.mabrupi.springlearning.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LearningRestController {

    @Value("${app.name}")
    private String appName;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring world from: " + appName;
    }
}
