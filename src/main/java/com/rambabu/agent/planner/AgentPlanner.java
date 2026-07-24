package com.rambabu.agent.planner;


import com.rambabu.agent.dto.ExecutionPlan;

public interface AgentPlanner {

    ExecutionPlan createPlan(String question);

}