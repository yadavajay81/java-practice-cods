package com.in28m.springboot.ajaylearnspringboot.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.in28m.springboot.ajaylearnspringboot.exception.UnformattedJsonException;

public class MyApiClient {

    private final RestTemplate restTemplate;

    public MyApiClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String makeApiCall(String apiUrl) {
        try {
            ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);
            // Process the responseEntity...
            return responseEntity.getBody();
        } catch (Exception e) {
            throw new UnformattedJsonException("Error processing JSON response", e);
        }
    }
}
