package com.learn.springBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @GetMapping("/")
    String noAction(){
        return "you reached to employee controller but you forgot specific action";
    }

    @GetMapping("")
    String empty(){
        return "it's empty in employee controller!!!";
    }

    @GetMapping("/read")
    String read(){
        return "reached to employee read";
    }
}
