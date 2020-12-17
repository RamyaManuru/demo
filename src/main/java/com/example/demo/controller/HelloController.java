package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String sayHello() {
        return "Greeting from Spring boot";
    }

    @RequestMapping("/bye")
    public String sayBye() {
        return "Thanks for using Spring boot, Good bye!!";
    }
}
