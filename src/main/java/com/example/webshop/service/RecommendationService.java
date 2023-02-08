package com.example.webshop.service;

import com.example.webshop.entity.Recommendation;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public interface RecommendationService {
    List<Recommendation> getRecommendations();

    Recommendation updateRecommendation(Recommendation recommendation) throws IOException;

    void save(Recommendation recommendation);

    void delete(Recommendation recommendation);
}
