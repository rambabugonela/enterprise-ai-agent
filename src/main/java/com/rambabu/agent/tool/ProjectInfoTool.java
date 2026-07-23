package com.rambabu.agent.tool;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

@Component
public class ProjectInfoTool {

    @Tool(description = "Returns Enterprise AI Agent project information")
    public String projectInformation() {

        return """
                Project Name : Enterprise AI Agent
                Version      : 0.3.0
                Author       : Rambabu Gonela
                Java         : 21
                Spring Boot  : 4.1
                Spring AI    : 2.0
                Build Tool   : Gradle
                Current Sprint : Sprint 3
                """;

    }

}