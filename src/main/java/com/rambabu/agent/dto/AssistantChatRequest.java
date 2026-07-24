package com.rambabu.agent.dto;

public record AssistantChatRequest(
        String sessionId,
        String message
) {
}