package com.wojnar.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .formLogin(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests((requests) -> requests
                        .requestMatchers(
                                "api/user/register",
                                "/v3/api-docs",
                                "/v3/api-docs.yaml",
                                "/v3/api-docs/**",
                                "/swagger-ui/**",
                                "/hello"
                        ).permitAll()
                        .anyRequest().authenticated()
                ).httpBasic(Customizer.withDefaults());

        return http.build();
    }
}