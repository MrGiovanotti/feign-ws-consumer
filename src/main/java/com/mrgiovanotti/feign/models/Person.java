package com.mrgiovanotti.feign.models;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Person implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private Integer id;
    private String identificationNumber;
    private String name;
    private Date birthDate;
    private boolean vaccinated;
    private Neighborhood neighborhood;
    
}
