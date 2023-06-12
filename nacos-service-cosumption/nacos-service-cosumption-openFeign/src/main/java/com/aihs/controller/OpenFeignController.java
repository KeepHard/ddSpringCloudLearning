package com.aihs.controller;

import com.aihs.feign.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenFeignController {

    @Autowired
    private Client client;

    @GetMapping("/invokeHello")
    public String invokeHello(){
        return "Return: " + client.hello("AIHS");
    }
}
