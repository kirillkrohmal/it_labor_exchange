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

    @PostMapping("/api/recommendations" )
    public String addRecommendation(@RequestBody Recommendation recommendation) {
        if(recommendation.getSalary() < 1 || recommendation.getTitle().isEmpty() || recommendation.getDescription().isEmpty()) throw new IllegalArgumentException("все поля должны быть заполнены");
        recommendationService.save(recommendation);

        return "success-added";
    }


    @GetMapping("/api/recommendations")
    public List<Recommendation> getRecommendations() {
        return recommendationService.getRecommendations();
    }

    @GetMapping("/new")
    public String addNewRecommendations(Model model, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            model.addAttribute("recommendation", new Recommendation());
        }

        return "create-new";
    }

    @PostMapping
    public String save(@ModelAttribute("recommendation") Recommendation recommendation) {
        recommendationService.save(recommendation);

        return "redirect:/recommendations/";
    }

    @GetMapping(value = "/CreateResume")
    public String edit(Model model) {
        model.addAttribute("recommendation", new Recommendation());

        return "/edit";
    }

    @PutMapping
    public String update(@ModelAttribute("recommendation") Recommendation recommendation) throws IOException {
        recommendationService.updateRecommendation(recommendation);

        return "redirect:/api/recommendations";
    }


    @DeleteMapping
    public String delete(@PathVariable("recommendation") Recommendation recommendation) {
        recommendationService.delete(recommendation);

        return "redirect:/api/recommendations";
    }

}
