package com.cognizant.springlearn.jwt_auth_demo.controller;

import com.cognizant.springlearn.jwt_auth_demo.util.JwtUtil;
import com.cognizant.springlearn.jwt_auth_demo.model.JwtResponse;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    private final JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @GetMapping("/authenticate")
    public JwtResponse generateToken(Authentication authentication) {
        String username = authentication.getName();
        String token = jwtUtil.generateToken(username);
        return new JwtResponse(token);
    }
}
