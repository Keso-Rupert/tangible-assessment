package com.abnamro.assessment.repository;

import com.abnamro.assessment.model.Person;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {}
