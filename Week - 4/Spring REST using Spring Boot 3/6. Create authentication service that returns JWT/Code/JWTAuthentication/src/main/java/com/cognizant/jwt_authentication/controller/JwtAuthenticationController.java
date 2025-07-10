package com.cognizant.jwt_authentication.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import jakarta.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;
import java.util.Date;

@RestController
public class JwtAuthenticationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(JwtAuthenticationController.class);
    private static final String SECRET_KEY = "secretKey123"; // You can externalize it

    @GetMapping("/authenticate")
    public TokenResponse authenticate(HttpServletRequest request) {
        LOGGER.info("Authenticating user...");

        // Get Authorization header
        String authHeader = request.getHeader("Authorization");

        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            throw new RuntimeException("Missing or invalid Authorization header");
        }

        // Decode base64 username:password
        String base64Credentials = authHeader.substring("Basic ".length()).trim();
        String credentials = new String(Base64.getDecoder().decode(base64Credentials));
        String[] values = credentials.split(":", 2);
        String username = values[0];

        // Create JWT
        String token = Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 60 * 60 * 1000)) // 1 hour
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();

        LOGGER.info("Token generated for user: {}", username);
        return new TokenResponse(token);
    }

    static class TokenResponse {
        private String token;

        public TokenResponse(String token) {
            this.token = token;
        }

        public String getToken() {
            return token;
        }
    }
}