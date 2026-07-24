package com.rambabu.agent.executor;

import com.rambabu.agent.dto.ExecutionPlan;
import com.rambabu.agent.dto.ExecutionResult;
import com.rambabu.agent.dto.ToolStep;
import com.rambabu.agent.tool.CalculatorTool;
import com.rambabu.agent.tool.EnterpriseAiAssistantTool;
import com.rambabu.agent.tool.TimeTool;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PlanExecutorImpl implements PlanExecutor {

    private final TimeTool timeTool;

    private final CalculatorTool calculatorTool;

    private final EnterpriseAiAssistantTool enterpriseAssistantTool;

    @Override
    public List<ExecutionResult> execute(ExecutionPlan plan) {

        List<ExecutionResult> results = new ArrayList<>();

        for (ToolStep step : plan.steps()) {

            String response = switch (step.tool()) {

                case TIME -> executeTime(step);

                case CALCULATOR -> executeCalculator(step);

                case ENTERPRISE_ASSISTANT ->
                        enterpriseAssistantTool.askEnterpriseAssistant(
                                step.input());

            };

            results.add(
                    new ExecutionResult(
                            step.tool(),
                            step.method(),
                            response));

        }
        return results;
    }

    private String executeTime(ToolStep step) {
        return switch (step.method()) {
            case "currentDate" ->
                    timeTool.currentDate().toString();
            case "currentTime" ->
                    timeTool.currentTime().toString();
            case "currentDateTime" ->
                    timeTool.currentDateTime().toString();
            default ->
                    throw new IllegalArgumentException(
                            "Unknown Time Action : " + step.method());
        };

    }


    private String executeCalculator(ToolStep step) {
        String[] values = step.input().split(",");
        if (values.length != 2) {
            throw new IllegalArgumentException(
                    "Calculator expects input format a,b");
        }
        double a = Double.parseDouble(values[0].trim());
        double b = Double.parseDouble(values[1].trim());
        return switch (step.method()) {
            case "add" ->
                    String.valueOf(calculatorTool.add(a, b));
            case "subtract" ->
                    String.valueOf(calculatorTool.subtract(a, b));
            case "multiply" ->
                    String.valueOf(calculatorTool.multiply(a, b));
            case "divide" ->
                    String.valueOf(calculatorTool.divide(a, b));
            default ->
                    throw new IllegalArgumentException(
                            "Unknown Calculator Action : " + step.method());
        };

    }

}