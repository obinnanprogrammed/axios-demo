package com.example.axiosdemo_backend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackendController {
    @RequestMapping("/hello")
    public String index() {
        return "Hello there from Spring Boot!";
    }
}
