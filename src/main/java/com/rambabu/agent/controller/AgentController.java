package com.rambabu.agent.controller;

import com.rambabu.agent.agent.EnterpriseAgent;
import com.rambabu.agent.dto.AgentRequest;
import com.rambabu.agent.dto.AgentResponse;
import com.rambabu.agent.dto.ExecutionPlan;
import com.rambabu.agent.planner.AgentPlanner;
import com.rambabu.agent.service.AgentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/agent")
@RequiredArgsConstructor
public class AgentController {

    private final EnterpriseAgent enterpriseAgent;
    private final AgentService agentService;

    @PostMapping("/chat")
    public AgentResponse chat(@Valid @RequestBody AgentRequest request) {

        String response = enterpriseAgent.chat(request.message());

        return new AgentResponse(
                response,
                LocalDateTime.now()
        );
    }

    @PostMapping("/agent")
    public AgentResponse ask(
            @RequestBody AgentRequest request) {

        return agentService.process(
                request.message());

    }
}