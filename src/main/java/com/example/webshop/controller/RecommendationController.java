package com.example.webshop.controller;

import com.example.webshop.entity.Recommendation;
import com.example.webshop.service.RecommendationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecommendationController {

    @Autowired
    private RecommendationServiceImpl recommendationService;

    @GetMapping("/api/recommendations")
    public List<Recommendation> getRecommendations() {
        return recommendationService.getRecommendations();
    }
}
