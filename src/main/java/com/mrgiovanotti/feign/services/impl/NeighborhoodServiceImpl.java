package com.mrgiovanotti.feign.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mrgiovanotti.feign.feignclients.NeighborhoodFeignClient;
import com.mrgiovanotti.feign.models.Neighborhood;
import com.mrgiovanotti.feign.services.NeighborhoodService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NeighborhoodServiceImpl implements NeighborhoodService {
    
    private final NeighborhoodFeignClient neighborhoodFeignClient;
    
    @Override
    public List<Neighborhood> list() {
        return neighborhoodFeignClient.list();
    }
    
}
