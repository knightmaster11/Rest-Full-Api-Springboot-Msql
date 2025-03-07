package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/w")
public class wellcomeController {
    
    @GetMapping
    public String welcome(){
        return "hai ini ternyata work";
    } 
}
