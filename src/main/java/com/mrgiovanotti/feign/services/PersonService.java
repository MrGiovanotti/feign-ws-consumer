package com.mrgiovanotti.feign.services;

import java.util.List;
import java.util.Optional;

import com.mrgiovanotti.feign.models.Person;

public interface PersonService {
    
    List<Person> list();
    
    Optional<Person> viewByIdentification(String identification);
    
}
