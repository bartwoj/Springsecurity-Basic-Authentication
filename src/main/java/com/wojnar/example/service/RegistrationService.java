package com.wojnar.example.service;

import com.wojnar.example.model.AppUser;
import com.wojnar.example.model.AppUserRole;
import com.wojnar.example.model.RegistrationRequest;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    private final EmailValidator emailValidator;
    private final AppUserService appUserService;

    public RegistrationService(EmailValidator emailValidator, AppUserService appUserService) {
        this.emailValidator = emailValidator;
        this.appUserService = appUserService;
    }

    public AppUser register(RegistrationRequest registrationRequest) {
        boolean isValidEmail = emailValidator.test(registrationRequest.email());

        if (!isValidEmail) {
            throw new IllegalStateException("email not valid");
        }

        return appUserService.signUpUser(
                        registrationRequest.email(),
                        registrationRequest.password(),
                        AppUserRole.USER
        );
    }
}
