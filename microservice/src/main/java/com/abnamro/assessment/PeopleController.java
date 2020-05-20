package com.abnamro.assessment;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 */
@Path("/people")
@Singleton
public class PeopleController {

    @GET
    public String sayHello() {
        return "Hello to the people!";
    }
}
