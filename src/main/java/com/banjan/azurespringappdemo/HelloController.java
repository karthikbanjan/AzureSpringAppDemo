package com.banjan.azurespringappdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hello, Karthik Banjan, your Azure Spring App is up and running.";
    }
}
