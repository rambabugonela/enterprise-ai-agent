package com.rambabu.agent.dto;

import java.time.LocalDateTime;

public record AgentResponse(

        String response,

        LocalDateTime timestamp

) {
}