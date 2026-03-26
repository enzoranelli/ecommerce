package com.enzoranelli.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public")
public class TestRoutes {
    @GetMapping("/test")
    public String getTest(){
        return "hola mundo!";
    }
}
