package com.abnamro.assessment.service;

import java.util.ArrayList;
import java.util.List;

import com.abnamro.assessment.model.Person;
import com.abnamro.assessment.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * PersonService
 */
@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public void createPerson(Person person) {
        personRepository.save(person);
    }

    public List<Person> listFilteredPersons() {
        List<Person> personList = new ArrayList<Person>();
        personRepository.findAll().forEach(person -> personList.add(person));
        return personList;
    }
    
}