package com.rambabu.agent.service;

import com.rambabu.agent.integration.EnterpriseAiAssistantClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnterpriseAiAssistantService {

    private final EnterpriseAiAssistantClient client;

    public String askEnterpriseAssistant(String question) {
        return client.askQuestion(question);
    }

}