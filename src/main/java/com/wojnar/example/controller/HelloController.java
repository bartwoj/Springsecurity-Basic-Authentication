package com.wojnar.example.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/secured/hello")
    public String home() {
        return "hello secured";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello not secured";
    }
}
