package com.mrgiovanotti.feign.services.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mrgiovanotti.feign.feignclients.PersonFeignClient;
import com.mrgiovanotti.feign.models.Person;
import com.mrgiovanotti.feign.services.PersonService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PersonServiceImpl implements PersonService {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(PersonServiceImpl.class);
    
    private final PersonFeignClient personFeignClient;
    
    @Override
    public List<Person> list() {
        return personFeignClient.list();
    }
    
    @Override
    public Optional<Person> viewByIdentification(String identification) {
        
        Person person = personFeignClient.viewByIdentification(identification);
        
        LOGGER.info("Received by WS: {}", person);
        
        if (person != null) {
            return Optional.of(person);
        }
        return Optional.empty();
    }
    
}
