package com.learn.springBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//RESTful Webservices methods
//
//        GET - Read
//        PUT - Update
//        POST - Create
//        DELETE - delete

@RestController
@RequestMapping("/main")
public class MainController {

    @GetMapping("")
    String empty(){
        return "it's empty in main controller!!!";
    }

    @GetMapping("/")
    String classLevel(){
        return "class level";
    }

    @GetMapping("/test1")
    String test1(){
        return "method level";
    }

    @GetMapping("/test2/test3")
    String test3(){
        return "custom url";
    }
}
