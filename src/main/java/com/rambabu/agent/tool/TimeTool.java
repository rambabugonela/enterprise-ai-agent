package com.rambabu.agent.tool;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

@Component
public class TimeTool {

    @Tool(description = "Returns the current date")
    public LocalDate currentDate() {
        return LocalDate.now();
    }

    @Tool(description = "Returns the current time")
    public LocalTime currentTime() {
        return LocalTime.now();
    }

    @Tool(description = "Returns the current date and time")
    public LocalDateTime currentDateTime() {
        return LocalDateTime.now();
    }

}