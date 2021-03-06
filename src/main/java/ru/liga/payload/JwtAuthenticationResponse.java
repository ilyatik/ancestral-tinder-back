package ru.liga.payload;

import lombok.Data;

@Data
public class JwtAuthenticationResponse {

    private final String tokenType = "Bearer";
    private String accessToken;

    public JwtAuthenticationResponse(String accessToken) {
        this.accessToken = accessToken;
    }
}
