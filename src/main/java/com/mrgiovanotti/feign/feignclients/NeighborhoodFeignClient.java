package com.mrgiovanotti.feign.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.mrgiovanotti.feign.models.Neighborhood;

@FeignClient(name = "neighborhood", url = "${mockito-third-party-neighborhood-url}")
public interface NeighborhoodFeignClient {
    
    @GetMapping("/list")
    List<Neighborhood> list();
    
}
