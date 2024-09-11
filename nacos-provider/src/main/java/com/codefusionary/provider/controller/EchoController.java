package com.codefusionary.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class EchoController {

    @Value("${echo.prefix}")
    private String prefix;

    @GetMapping("/echo/{message}")
    public String echo(@PathVariable String message) {
        return prefix + ": " + message;
    }
}
