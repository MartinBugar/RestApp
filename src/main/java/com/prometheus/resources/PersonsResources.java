package com.prometheus.resources;

import com.prometheus.entity.Person;
import com.prometheus.services.PersonService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/persons") // rooot nadradeny
public class PersonsResources {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getPersons(){
        return PersonService.getPersonService().getAllPersons();
    }

    @GET
    @Path("/{personId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPerson (@PathParam("personId") long personId){
        return PersonService.getPersonService().getPersonById(personId);
    }

    @POST
    @Produces (MediaType.APPLICATION_JSON)
    @Consumes (MediaType.APPLICATION_JSON)
    public Person addPerson (Person person){
        return PersonService.getPersonService().addPerson(person);
    }

}
