package com.prometheus.services;

import com.prometheus.entity.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonService {

    private static PersonService instance; // instancia pre singleton pattern
    public Map<Long,Person> persons = new HashMap();

    private PersonService(){
        Person person1 = new Person(1L,"Martin", "Bugar", 26);
        Person person2 = new Person(2L,"Cupretka", "Belizova", 33);
        persons.put(person1.getId(),person1);
        persons.put(person2.getId(),person2);
    }

    public static PersonService getPersonService (){
        if (instance == null) {
            return instance = new PersonService();
        }
        return instance;
    }



    public List <Person> getAllPersons (){
        return new ArrayList<>(persons.values());
    }

    public Person getPersonById(long id){
       return persons.get(id);
    }
}
