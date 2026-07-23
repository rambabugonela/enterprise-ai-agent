package com.rambabu.agent.agent;

import com.rambabu.agent.prompt.PromptFactory;
import com.rambabu.agent.tool.CalculatorTool;
import com.rambabu.agent.tool.ProjectInfoTool;
import com.rambabu.agent.tool.TimeTool;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EnterpriseAgent {

    private final ChatClient chatClient;
    private final PromptFactory promptFactory;
    private final CalculatorTool calculatorTool;
    private final TimeTool timeTool;
    private final ProjectInfoTool projectInfoTool;

    public String chat(String message) {

        return chatClient.prompt()
                .system(promptFactory.systemPrompt())
                .user(message)
                .tools(calculatorTool,
                        timeTool,
                        projectInfoTool)
                .call()
                .content();
    }
}