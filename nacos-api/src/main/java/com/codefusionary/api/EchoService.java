package com.codefusionary.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "nacos-provider")
public interface EchoService {
    @GetMapping("/echo/{message}")
    String echo(@PathVariable("message") String message);
}
