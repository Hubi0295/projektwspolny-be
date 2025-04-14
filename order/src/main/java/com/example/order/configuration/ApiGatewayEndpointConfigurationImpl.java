package com.example.order.configuration;

import com.example.basket.ApiGatewayEndpointConfiguration;
import com.example.basket.entity.Endpoint;
import com.example.basket.entity.HttpMethod;
import com.example.basket.entity.Response;
import com.example.basket.entity.Role;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ApiGatewayEndpointConfigurationImpl implements ApiGatewayEndpointConfiguration {

    @Value("${api-gateway.url}")
    private String GATEWAY_URL;

    @PostConstruct
    public void startrOperation(){
        initMap();
        register();
    }

    @Override
    public void initMap() {
        endpointList.add(new Endpoint("/api/v1/order", HttpMethod.POST, Role.GUEST));
        endpointList.add(new Endpoint("/api/v1/order/notification", HttpMethod.POST, Role.GUEST));
        endpointList.add(new Endpoint("/api/v1/order", HttpMethod.GET, Role.GUEST));
    }

    @Override
    public void register() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Response> response = restTemplate.postForEntity(GATEWAY_URL, endpointList, Response.class);
        if (response.getStatusCode().isError()) throw new RuntimeException();
    }
}
