package com.online.test_trail.service.impl;

import com.online.test_trail.dto.ContentDto;
import com.online.test_trail.entity.Content;
import com.online.test_trail.repo.ContentRepo;
import com.online.test_trail.service.ContentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ContentServiceImpl implements ContentService {

    private final ContentRepo contentRepo;


    @Override
    public List<Content> findAll() {
        return contentRepo.findAll();

    }

    @Override
    public List<Content> searchByCategory(String category) {
        return contentRepo.searchByCategory(category);
    }

//    @Override
//    public Optional<Content> findById(Long id) {
//        return contentRepo.findById(id);
//    }
//
//    @Override
//    public void deleteById(Long id) {
//        contentRepo.deleteById(id);
//    }

    @Override
    public void save(ContentDto contentDto) {
        Content content;

        if (contentDto.getId() != null) {
            content = contentRepo.findById(contentDto.getId()).get();
        } else {
            content = new Content();
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
        content.setRecipePhoto(contentDto.getRecipePhoto());
        content.setIncredientList(contentDto.getIngredientsList());

        content = contentRepo.save(content);


    }

    @Override
    public Content findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<Content> searchByTitle(String title) {
        return null;
    }

    @Override
    public void update(Long id, ContentDto contentDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");

    }
}
