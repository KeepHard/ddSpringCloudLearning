package com.aihs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestTemplateController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/invokeHello")
    public String invokeHello(){
        return "Return: "+restTemplate.getForObject("http://alibaba-nacos-discovery-server/hello?name=AIHS",String.class);
    }
}
