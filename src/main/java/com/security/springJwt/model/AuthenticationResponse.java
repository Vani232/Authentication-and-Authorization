package com.security.springJwt.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthenticationResponse {


    private String token;

    public AuthenticationResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}