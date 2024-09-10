package com.codefusionary.provider.controller;

import com.codefusionary.api.EchoService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController implements EchoService {
    @Override
    public String echo(String message) {
        return "Echo from provider: " + message;
    }
}
