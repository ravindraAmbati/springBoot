package com.learn.springBoot.service;

import com.learn.springBoot.entity.Person;
import com.learn.springBoot.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepo personRepo;

    public List<Person> findAll() {
        return personRepo.findAll();
    }

    public Person save(Person person) {
        return personRepo.save(person);
    }
}
