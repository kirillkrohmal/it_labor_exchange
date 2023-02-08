package com.example.webshop.controller;

import com.example.webshop.entity.Recommendation;
import com.example.webshop.service.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class RecommendationController {

    @Autowired
    private RecommendationService recommendationService;

    @GetMapping("/api/recommendations")
    public List<Recommendation> getRecommendations() {
        return recommendationService.getRecommendations();
    }

    @GetMapping("/new")
    public String addNewRecommendations(@ModelAttribute("recommendation") Recommendation recommendation, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            model.addAttribute("recommendation", recommendation);
        }

        return "create-new";
    }

    @PostMapping("new")
    public String save(@ModelAttribute("recommendation") Recommendation recommendation) {
        recommendationService.save(recommendation);

        return "redirect:/recommendations/";
    }

    @GetMapping(value = "/edit")
    public String edit(@ModelAttribute("recommendation")Recommendation recommendation, Model model) {
        model.addAttribute("recommendation", recommendation);

        return "/edit";
    }

    @PutMapping
    public String update(@ModelAttribute("recommendation")Recommendation recommendation) throws IOException {
        recommendationService.updateRecommendation(recommendation);

        return "redirect:/api/recommendations";
    }


    @DeleteMapping
    public String delete(@ModelAttribute("recommendation") Recommendation recommendation) {
        recommendationService.delete(recommendation);

        return "redirect:/api/recommendations";
    }

}
