package com.relin.beanny.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @GetMapping()
    public String getHelloWorld() {
        return "Hello World";
    }
}
