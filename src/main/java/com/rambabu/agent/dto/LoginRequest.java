package com.rambabu.agent.dto;

public record LoginRequest(
        String username,
        String password
) {
}