package com.develhope.deploy01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping
    public String devName(){
        return "Michele Carrillo";
    }
}
