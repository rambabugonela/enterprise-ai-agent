package com.rambabu.agent.dto;

import java.util.List;

public record ExecutionPlan(

        List<ToolStep> steps

) {
}