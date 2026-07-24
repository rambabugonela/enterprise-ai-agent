package com.rambabu.agent.dto;

public record ExecutionResult(

        ToolType tool,

        String action,

        String result

) {
}