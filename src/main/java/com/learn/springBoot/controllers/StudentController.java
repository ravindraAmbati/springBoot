package com.learn.springBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/std")
public class StudentController {

    @GetMapping("/")
    String noAction(){
        return "you reached to student controller but you forgot specific action";
    }

    @GetMapping("")
    String empty(){
        return "it's empty in student controller!!!";
    }

    @GetMapping("/read")
    String read(){
        return "reached to read student";
    }
}
