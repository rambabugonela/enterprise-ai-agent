package com.rambabu.agent.executor;

import com.rambabu.agent.dto.ExecutionPlan;
import com.rambabu.agent.dto.ExecutionResult;

import java.util.List;

public interface PlanExecutor {

    List<ExecutionResult> execute(ExecutionPlan plan);

}