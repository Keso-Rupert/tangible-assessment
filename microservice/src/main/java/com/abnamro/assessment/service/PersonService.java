package com.abnamro.assessment.service;

import com.abnamro.assessment.model.Person;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/persons")
public interface PersonService {

  @GET
  List<Person> getAllPersons();

  @POST
  int storePerson();

}
