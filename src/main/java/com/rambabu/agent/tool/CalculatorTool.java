package com.rambabu.agent.tool;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

@Component
public class CalculatorTool {

    @Tool(description = "Performs addition of two numbers")
    public double add(double a, double b) {
        return a + b;
    }

    @Tool(description = "Performs subtraction of two numbers")
    public double subtract(double a, double b) {
        return a - b;
    }

    @Tool(description = "Performs multiplication of two numbers")
    public double multiply(double a, double b) {
        return a * b;
    }

    @Tool(description = "Performs division of two numbers")
    public double divide(double a, double b) {

        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }

        return a / b;
    }

}