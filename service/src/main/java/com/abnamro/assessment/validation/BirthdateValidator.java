package com.abnamro.assessment.validation;


import java.time.LocalDate;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Value;

public class BirthdateValidator implements
  ConstraintValidator<BirthdateConstraint, LocalDate> {
 
    @Value("${banned.years}")
    private List<Integer> bannedYears ;

    @Override
    public void initialize(BirthdateConstraint birthdate) {
    }
 
    @Override
    public boolean isValid(LocalDate birthdate,
      ConstraintValidatorContext cxt) {
        if (bannedYears.contains(birthdate.getYear())) {
            return false;
        } else {
            return true;
        }
    }
 
}