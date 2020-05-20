package com.abnamro.assessment.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.abnamro.assessment.validation.BirthdateConstraint;


/**
 * Person
 */
@Entity
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Size(min = 2)
    @Column(unique=true)
    private String name;
    
    @NotNull
    @BirthdateConstraint
    private LocalDate birthDate;

    public Person() {}

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}