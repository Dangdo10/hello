package com.java.dangdo1198.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/api/sayHello")
    public String greeting() {
        System.out.println("dang van do");
        return "hello";
    }
}
