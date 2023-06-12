package com.aihs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
public class WebClientController {
    @Autowired
    private WebClient.Builder webClientBuilder;

    @GetMapping("/invokeHello")
    public Mono<String> invokeHello(){
        Mono<String> result = webClientBuilder.build()
                .get()
                .uri("http://alibaba-nacos-discovery-server/hello?name=AIHS")
                .retrieve()
                .bodyToMono(String.class);
        return result;
    }
}
