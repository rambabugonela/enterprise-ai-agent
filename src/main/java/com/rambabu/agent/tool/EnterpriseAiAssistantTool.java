package com.rambabu.agent.tool;

import com.rambabu.agent.service.EnterpriseAiAssistantService;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EnterpriseAiAssistantTool {

    private final EnterpriseAiAssistantService service;

    @Tool(description = """
            Use this tool whenever the user asks questions about:
            Spring AI,
            RAG,
            Redis,
            PGVector,
            Enterprise AI Assistant,
            Enterprise architecture,
            Knowledge Base,
            Vector Search,
            or any technical documentation.
            """)
    public String askEnterpriseAssistant(String question) {

        return service.askEnterpriseAssistant(question);

    }

}