package com.rambabu.agent.controller;

import com.rambabu.agent.agent.EnterpriseAgent;
import com.rambabu.agent.dto.AgentRequest;
import com.rambabu.agent.dto.AgentResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/agent")
@RequiredArgsConstructor
public class AgentController {

    private final EnterpriseAgent enterpriseAgent;

    @PostMapping("/chat")
    public AgentResponse chat(@Valid @RequestBody AgentRequest request) {

        String response = enterpriseAgent.chat(request.message());

        return new AgentResponse(
                response,
                LocalDateTime.now()
        );
    }
}