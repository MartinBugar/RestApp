package com.prometheus.resources;

import com.prometheus.entity.Person;
import com.prometheus.services.PersonService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/persons")
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


}
