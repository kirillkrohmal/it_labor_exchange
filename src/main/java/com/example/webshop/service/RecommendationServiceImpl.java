package com.example.webshop.service;

import com.example.webshop.entity.Recommendation;
import com.example.webshop.repository.RecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.google.common.collect.Lists;

@Service
public class RecommendationServiceImpl implements RecommendationService{

    @Autowired
    private RecommendationRepository repository;

    @Override
    public List<Recommendation> getRecommendations() {
        return Lists.newArrayList(repository.findAll());
    }
}
