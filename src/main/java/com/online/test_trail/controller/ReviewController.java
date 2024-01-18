package com.online.test_trail.controller;

import com.online.test_trail.dto.ReviewDto;
import com.online.test_trail.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/review")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;


    @PostMapping
    public String save(@RequestBody ReviewDto reviewDto) {
        reviewService.save(reviewDto);
        return "Data saved";
    }
}