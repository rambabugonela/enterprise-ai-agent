package com.rambabu.agent.agent;

import com.rambabu.agent.prompt.PromptFactory;
import com.rambabu.agent.tool.CalculatorTool;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EnterpriseAgent {

    private final ChatClient chatClient;
    private final PromptFactory promptFactory;
    private final CalculatorTool calculatorTool;

    public String chat(String message) {

        return chatClient.prompt()
                .system(promptFactory.systemPrompt())
                .user(message)
                .tools(calculatorTool)
                .call()
                .content();
    }
}