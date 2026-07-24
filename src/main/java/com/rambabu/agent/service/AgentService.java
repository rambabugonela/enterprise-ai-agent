package com.rambabu.agent.service;

import com.rambabu.agent.dto.AgentResponse;
import com.rambabu.agent.dto.ExecutionPlan;
import com.rambabu.agent.dto.ExecutionResult;
import com.rambabu.agent.executor.PlanExecutor;
import com.rambabu.agent.planner.AgentPlanner;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class AgentService {

    private final AgentPlanner planner;

    private final PlanExecutor executor;

    public AgentResponse process(String question) {

        ExecutionPlan plan = planner.createPlan(question);
        log.info("Execution Plan : {}", plan);
        List<ExecutionResult> results =
                executor.execute(plan);

        StringBuilder response = new StringBuilder();

        for (ExecutionResult result : results) {

            response.append(result.result())
                    .append("\n\n");

        }

        return new AgentResponse(
                response.toString(),
                LocalDateTime.now());
    }

}