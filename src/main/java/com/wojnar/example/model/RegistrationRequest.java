package com.wojnar.example.model;

public record RegistrationRequest(
        String email,
        String password
) {
}
