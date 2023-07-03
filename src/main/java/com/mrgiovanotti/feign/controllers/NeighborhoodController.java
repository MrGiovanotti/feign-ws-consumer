package com.mrgiovanotti.feign.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrgiovanotti.feign.models.Neighborhood;
import com.mrgiovanotti.feign.services.NeighborhoodService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/neighborhood")
@RequiredArgsConstructor
public class NeighborhoodController {
    
    private final NeighborhoodService neighborhoodService;
    
    @GetMapping("/list")
    public List<Neighborhood> list() {
        return neighborhoodService.list();
    }
    
}
