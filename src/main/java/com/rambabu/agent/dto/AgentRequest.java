package com.rambabu.agent.dto;

import jakarta.validation.constraints.NotBlank;

public record AgentRequest(

        @NotBlank(message = "Message cannot be blank")
        String message

) {
}