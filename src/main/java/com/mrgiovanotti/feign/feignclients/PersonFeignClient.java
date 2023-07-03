package com.mrgiovanotti.feign.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mrgiovanotti.feign.models.Person;

@FeignClient(name = "person", url = "${mockito-third-party-person-url}")
public interface PersonFeignClient {
    
    @GetMapping("/list")
    List<Person> list();
    
    @GetMapping("/view/identification/{identification}")
    Person viewByIdentification(@PathVariable String identification);
    
}
