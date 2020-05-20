package com.abnamro.assessment.controller;

import com.abnamro.assessment.model.Person;
import com.abnamro.assessment.service.PersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons")
    private List<Person> getFilteredPersons() {
        return personService.listFilteredPersons();
    }

    @PostMapping("/persons")
    private int savePerson(@RequestBody Person person) {
        personService.createPerson(person);
        return person.getId();
    }

    //Was working on exception handling for when validation fails, but time was up...
//    @ExceptionHandler({  })
//    public String handleException() {
//        return "Sorry ya just can't do that";
//    }

}