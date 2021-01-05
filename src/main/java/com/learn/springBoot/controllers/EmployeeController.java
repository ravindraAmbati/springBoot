package com.learn.springBoot.controllers;

import com.learn.springBoot.entity.Employee;
import com.learn.springBoot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/findAll")
    List<Employee> findAll() {
        return employeeService.findAll();
    }

    @PostMapping(path = "/create", consumes = "application/json", produces = "application/json")
    Employee create(Employee employee) {
        return employeeService.save(employee);
    }
}
