package com.example.pontocerto.tokens;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Date;

public class JwtUtil {

    private static final String SECRET = "minha_chave_super_secreta_123456789012345";
    private static final Key KEY = Keys.hmacShaKeyFor(SECRET.getBytes());

    // Gerar token
    public static String gerarToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 86400000)) // 1 dia
                .signWith(KEY, SignatureAlgorithm.HS256)
                .compact();
    }

    // Validar token
    public static String validarToken(String token) {
        Claims claims = Jwts.parserBuilder()
                .setSigningKey(KEY)
                .build()
                .parseClaimsJws(token)
                .getBody();

        return claims.getSubject();
    }
}