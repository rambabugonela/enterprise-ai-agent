package com.rambabu.agent.prompt;

import org.springframework.stereotype.Component;

@Component
public class PromptFactory {

    public String systemPrompt() {

        return """
                You are an Enterprise AI Agent.

                Your responsibility is to assist users professionally.

                Keep responses concise, accurate and enterprise friendly.
                """;
    }

}