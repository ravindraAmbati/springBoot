package com.learn.springBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

    @GetMapping("/")
    String nothing(){
        return "it's nothing here!!!";
    }

    @GetMapping("")
    String empty(){
        return "it's empty here!!!";
    }
}
