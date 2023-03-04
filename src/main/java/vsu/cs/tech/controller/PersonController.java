package vsu.cs.tech.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vsu.cs.tech.entity.Person;
import vsu.cs.tech.repository.PersonRepository;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @PostMapping("/persons")
    public void addPersons(@RequestBody final List<Person> persons) {
        personRepository.saveAll(persons);
    }

    @GetMapping("/persons")
    public List<Person> findPersons() {
        return personRepository.findAll();
    }

    @GetMapping("/persons/{name}")
    public Person findPerson(@PathVariable final String name) {
        return personRepository.findByName(name);
    }
}
