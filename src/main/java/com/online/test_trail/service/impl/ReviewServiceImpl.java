package com.online.test_trail.service.impl;

import com.online.test_trail.entity.Content;
import com.online.test_trail.entity.UserEntity;
import com.online.test_trail.repo.ContentRepo;
import com.online.test_trail.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepo reviewRepo;
    private final UserRepo userRepo;
    private final ContentRepo contentRepo;

    @Override
    public void save(ReviewDto reviewDto) {
        Review review;

        if (reviewDto.getId() != null) {
            review = reviewRepo.findById(reviewDto.getId()).get();
        } else {
            review = new Review();
        }

        Content content = contentRepo.findById(reviewDto.getContentId()).get();
        UserEntity user = userRepo.findById(reviewDto.getUserId()).get();


        review.setContent(content);
        review.setUserId(user);
        review.setRate(reviewDto.getRate());

        reviewRepo.save(review);
    }
}
