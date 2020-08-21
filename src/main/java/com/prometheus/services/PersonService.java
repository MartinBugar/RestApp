package com.prometheus.services;

import com.prometheus.entity.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonService {

    private static PersonService instance; // instancia pre singleton pattern

    private PersonService(){
        Person person1 = new Person("Martin", "Bugar", 26);
        Person person2 = new Person("Cupretka", "Belizova", 33);
        persons.add(person1);
        persons.add(person2);
    }

    public static PersonService getPersonService (){
        if (instance == null) {
            return instance = new PersonService();
        }
        return instance;
    }

    public List<Person> persons = new ArrayList<>();

    public List <Person> getAllPersons (){
        return persons;
    }
}
