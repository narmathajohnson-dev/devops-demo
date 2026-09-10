package com.kum.ins.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public String sayHello() {
        return "Hello World! Your Spring Boot app is running smoothly in VS Code.";
    }
}
