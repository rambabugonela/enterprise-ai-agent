package com.rambabu.agent.integration;

import com.rambabu.agent.config.EnterpriseAssistantProperties;
import com.rambabu.agent.dto.AssistantChatRequest;
import com.rambabu.agent.dto.AssistantChatResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
@RequiredArgsConstructor
public class EnterpriseAiAssistantClient {

    private final RestClient.Builder restClientBuilder;
    private final EnterpriseAssistantProperties properties;
    private final AuthenticationManager authenticationManager;

    public String askQuestion(String question) {

        RestClient restClient = restClientBuilder
                .baseUrl(properties.baseUrl())
                .build();

        AssistantChatResponse response = restClient.post()
                .uri(properties.chatUrl())
                .header("Authorization",
                        "Bearer " + authenticationManager.getToken())
                .body(new AssistantChatRequest(
                        "enterprise-agent",
                        question))
                .retrieve()
                .body(AssistantChatResponse.class);

        return response.response();
    }

}