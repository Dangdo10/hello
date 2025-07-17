package com.java.dangdo1198.project.controller;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@Log4j2
public class HelloController {
    @GetMapping("/api/sayHello")
    public String greeting() {
        System.out.println("dang van do");
        log.info("Dang van do");
        return "hello";
    }
}
