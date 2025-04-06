package com.example.axiosdemo_backend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins="http://localhost:5173")
public class BackendController {
    @RequestMapping("/hello")
    public String index(@RequestBody String name) {
        String trim = name.substring(0, name.length()-1);
        return "Hello " + trim + " from Spring Boot!";
    }
}
