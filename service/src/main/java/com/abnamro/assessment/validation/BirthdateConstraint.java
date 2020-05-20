package com.abnamro.assessment.validation;

import java.lang.annotation.*;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = BirthdateValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface BirthdateConstraint {
    String message() default "Birthyear is banned";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}