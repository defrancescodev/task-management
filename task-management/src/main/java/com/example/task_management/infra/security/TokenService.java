package com.example.task_management.infra.security;

import com.example.task_management.domain.user.User;
import org.springframework.beans.factory.annotation.Value;

public class TokenService {
    @Value("api.security.token.secret")
    private String secret;

    public String generateToken(User user) {
        return null;
    }
}
