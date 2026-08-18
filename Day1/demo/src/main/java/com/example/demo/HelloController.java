package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // ---> /hello
    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/bye")
    public String bye(){
        return "BYE";
    }
}
