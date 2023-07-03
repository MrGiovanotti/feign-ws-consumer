package com.mrgiovanotti.feign.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrgiovanotti.feign.models.Person;
import com.mrgiovanotti.feign.services.PersonService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/person")
public class PersonController {
    
    private final PersonService personService;
    
    @GetMapping("/list")
    public ResponseEntity<List<Person>> list() {
        return ResponseEntity.ok(personService.list());
    }
    
    @GetMapping("/view/identification/{identification}")
    public ResponseEntity<Person> viewByIdentification(@PathVariable String identification) {
        Optional<Person> personOptional = personService.viewByIdentification(identification);
        
        if (personOptional.isPresent()) {
            return ResponseEntity.ok(personOptional.get());
        }
        
        return new ResponseEntity<>(new Person(), HttpStatus.NOT_FOUND);
    }
    
}
