package com.rambabu.agent;

import com.rambabu.agent.config.EnterpriseAssistantProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(EnterpriseAssistantProperties.class)
@SpringBootApplication
public class EnterpriseAiAgentApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnterpriseAiAgentApplication.class, args);
	}

}
