package com.learn.keycloak;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

    @GetMapping
    public String hell(){
        return "Hello from Spring boot & Keyclock";
    }

    @GetMapping("/hello-2")
    public String hello2(){
        return "Hello from Spring boot & keycloak - ADMIN";
    }
}
