package com.online.test_trail.service;

import java.util.List;

import com.online.test_trail.dto.ContentDto;
import com.online.test_trail.dto.response.ContentResponse;
import com.online.test_trail.entity.Content;

public interface ContentService {

    List<ContentResponse> findAll();
    List<Content> searchByCategory(String category);


//    Optional<Content> findById(Long id);

    void deleteById(Long id);

    void save(ContentDto contentDto);

}
