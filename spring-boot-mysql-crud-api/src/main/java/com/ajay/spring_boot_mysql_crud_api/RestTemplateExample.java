package com.ajay.spring_boot_mysql_crud_api;

import org.springframework.web.client.RestTemplate;

public class RestTemplateExample {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        String url = "https://jsonmock.hackerrank.com/api/moviesdata?Year=2015";
        String response = restTemplate.getForObject(url, String.class);

        System.out.println(response);
    }
}

