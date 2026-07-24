package com.rambabu.agent.integration;

import com.rambabu.agent.config.EnterpriseAssistantProperties;
import com.rambabu.agent.dto.LoginRequest;
import com.rambabu.agent.dto.LoginResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
@RequiredArgsConstructor
public class AuthenticationManager {

    private final RestClient.Builder restClientBuilder;
    private final EnterpriseAssistantProperties properties;

    private volatile  String jwtToken;

    public String getToken() {

        if (jwtToken == null) {
            authenticate();
        }

        return jwtToken;
    }

    private void authenticate() {

        RestClient restClient = restClientBuilder
                .baseUrl(properties.baseUrl())
                .build();
        System.out.println("Username = " + properties.username());
        System.out.println("Password = " + properties.password());
        LoginResponse response = restClient.post()
                .uri(properties.loginUrl())
                .body(new LoginRequest(
                        properties.username(),
                        properties.password()))
                .retrieve()
                .body(LoginResponse.class);

        this.jwtToken = response.token();
    }

}