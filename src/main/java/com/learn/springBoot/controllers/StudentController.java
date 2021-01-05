package com.learn.springBoot.controllers;

import com.learn.springBoot.entity.Student;
import com.learn.springBoot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/std")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/findAll")
    List<Student> findAll() {
        return studentService.findAll();
    }

    @PostMapping(path = "/create", consumes = "application/json", produces = "application/json")
    Student create(Student student) {
        return studentService.save(student);
    }
}
