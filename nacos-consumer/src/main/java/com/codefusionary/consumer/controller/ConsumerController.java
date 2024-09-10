package com.codefusionary.consumer.controller;

import com.codefusionary.api.EchoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    private final EchoService echoService;

    public ConsumerController(EchoService echoService) {
        this.echoService = echoService;
    }

    @GetMapping("/consumer/{message}")
    public String consumer(@PathVariable String message) {
        return echoService.echo(message);
    }
}
