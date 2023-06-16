package com.aihs.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class NacosConfig01Controller {

    @Value("${aihs.title}")
    private String title;

    @GetMapping("/hello")
    public String hello(){
        return title;
    }
}
