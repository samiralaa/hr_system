package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api/hello")
public class HelloController {

    @GetMapping("samir")
    public String getMethodName() {
        return "Samir";
    }
    
}
