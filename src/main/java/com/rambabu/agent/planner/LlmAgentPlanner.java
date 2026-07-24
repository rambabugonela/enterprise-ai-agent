package com.rambabu.agent.planner;

import com.rambabu.agent.dto.ExecutionPlan;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.stereotype.Service;

import static com.rambabu.agent.planner.PromptConstants.PLANNER_PROMPT;

@Slf4j
@Service
@RequiredArgsConstructor
public class LlmAgentPlanner implements AgentPlanner {

    private final ChatClient chatClient;

    @Override
    public ExecutionPlan createPlan(String question) {

        Prompt prompt = new Prompt(PLANNER_PROMPT.formatted(question));
        try {
            ExecutionPlan plan =
                    chatClient
                            .prompt(prompt)
                            .call()
                            .entity(ExecutionPlan.class);
            if (plan == null || plan.steps() == null) {
                throw new IllegalStateException("Execution plan is empty.");
            }
            return plan;

        } catch (Exception ex) {
            log.error("Planner failed", ex);
            throw new RuntimeException(
                    "Failed to generate execution plan",
                    ex);

        }

    }
}