package com.example.webshop.service;

import com.example.webshop.entity.Recommendation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RecommendationService {
    List<Recommendation> getRecommendations();
}
