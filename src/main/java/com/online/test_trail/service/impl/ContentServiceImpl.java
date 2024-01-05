package com.online.test_trail.service.impl;

import com.online.test_trail.dto.request.ContentDto;
import com.online.test_trail.entity.Content;
import com.online.test_trail.repo.ContentRepo;
import com.online.test_trail.service.ContentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ContentServiceImpl  implements ContentService {

    private final ContentRepo contentRepo;


    @Override
    public List<Content> findAll() {
        return null;
    }

    @Override
    public void save(ContentDto contentDto) {
        Content content;

        if(contentDto.getId()!=null){
            content= contentRepo.findById(contentDto.getId()).get();
        }else{
            content= new Content();
        }


        content.setCategoryType(contentDto.getCategoryType());
        content.setRecipeTitle(contentDto.getRecipeTitle());
        content.setRecipeDescription(contentDto.getRecipeDescription());
        content.setPreparationTimeHours(contentDto.getPreparationTimeHours());
        content.setPreparationTimeMinutes(contentDto.getPreparationTimeMinutes());
        content.setRecipeQuantityNumber(contentDto.getRecipeQuantityNumber());
        content.setRecipeQuantityType(contentDto.getRecipeQuantityType());
        content.setCategoryType(contentDto.getCategoryType());
        content.setStepDescription(contentDto.getStepDescription());
        content.setUsedIngredients(contentDto.getUsedIngredients());
        content.setRecipePhoto(contentDto.getRecipePhoto());
        content.setGatheredIngredients(contentDto.getGatheredIngredients());


        contentRepo.save(content);
    }
}
