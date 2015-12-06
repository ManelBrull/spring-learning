package com.mabrupi.springlearning.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LearningRestController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring world";
    }
}
