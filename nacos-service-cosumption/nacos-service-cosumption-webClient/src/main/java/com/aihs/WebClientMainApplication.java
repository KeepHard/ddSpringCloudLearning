package com.aihs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WebClientMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebClientMainApplication.class,args);
    }
}
