package com.cognizant.jwt_authentication.util;

import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtil {

    // Secret key used for signing the JWT
    private static final String SECRET_KEY = "mysecretkey";

    // Token validity: 10 minutes (in milliseconds)
    private static final long EXPIRATION_TIME = 10 * 60 * 1000;

    // Generate JWT token using username
    public String generateToken(String username) {
        return Jwts.builder()
            .setSubject(username)
            .setIssuedAt(new Date(System.currentTimeMillis()))
            .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
            .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
            .compact();
    }
}