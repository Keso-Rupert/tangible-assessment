package com.abnamro.assessment.controller;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/persons")
    private List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @PostMapping("/persons")
    private int savePerson(@RequestBody Person person) {
        personService.saveOrUpdate(person);
        return person.getId();
    }
}