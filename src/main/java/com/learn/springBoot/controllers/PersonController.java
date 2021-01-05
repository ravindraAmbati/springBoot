package com.learn.springBoot.controllers;

import com.learn.springBoot.entity.Person;
import com.learn.springBoot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/prs")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/findAll")
    List<Person> findAll() {
        return personService.findAll();
    }

    @PostMapping(path = "/create", consumes = "application/json", produces = "application/json")
    Person create(@RequestBody Person person) {
        personService.save(person);
        return new Person();
    }
}
