package com.cognizant.springlearn.jwt_auth_demo.util;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.security.Key;

@Component
public class JwtUtil {

    private final String SECRET = "MyJwtSecretKeyMyJwtSecretKey123456"; // Minimum 256-bit key

    public String generateToken(String username) {
        long now = System.currentTimeMillis();
        Key key = Keys.hmacShaKeyFor(SECRET.getBytes());

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date(now))
                .setExpiration(new Date(now + 1000 * 60 * 60)) // 1 hour validity
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }
}
