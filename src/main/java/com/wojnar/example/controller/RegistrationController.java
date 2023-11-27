package com.wojnar.example.controller;

import com.wojnar.example.model.RegistrationRequest;
import com.wojnar.example.service.RegistrationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    private final RegistrationService userService;

    public RegistrationController(RegistrationService userService) {
        this.userService = userService;
    }

    @PostMapping("/api/user/register")
    public boolean register(@RequestBody RegistrationRequest registrationRequest) {
        return userService.register(registrationRequest) != null;
    }
}
