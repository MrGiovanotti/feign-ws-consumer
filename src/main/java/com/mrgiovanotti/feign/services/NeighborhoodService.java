package com.mrgiovanotti.feign.services;

import java.util.List;

import com.mrgiovanotti.feign.models.Neighborhood;

public interface NeighborhoodService {
    
    List<Neighborhood> list();
    
}
