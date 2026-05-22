package com.in28m.springboot.ajaylearnspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28m.springboot.ajaylearnspringboot.exception.UnformattedJsonException;
import com.in28m.springboot.ajaylearnspringboot.service.MyApiClient;

@RestController
public class MyController {

    private final MyApiClient myApiClient;

    public MyController(MyApiClient myApiClient) {
        this.myApiClient = myApiClient;
    }

    @GetMapping("/getData")
    public String getDataFromApi() {
        try {
            return myApiClient.makeApiCall("https://api.example.com/data");
        } catch (UnformattedJsonException e) {
            // Handle the exception (log, return an error response, etc.)
            return "Error: Unformatted JSON response";
        }
    }
}
