package com.rambabu.agent.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "enterprise.assistant")
public record EnterpriseAssistantProperties(
        String baseUrl,
        String loginUrl,
        String chatUrl,
        String username,
        String password
) {
}