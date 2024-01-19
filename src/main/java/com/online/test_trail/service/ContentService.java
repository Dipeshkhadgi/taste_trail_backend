package com.online.test_trail.service;

import com.online.test_trail.dto.ContentDto;
import com.online.test_trail.entity.Content;

import java.util.List;
import java.util.Optional;

public interface ContentService {

    List<Content> findAll();
    Content findById(Long id);
    List<Content> searchByTitle(String title);
    List<Content> searchByCategory(String category);

//    Optional<Content> findById(Long id);

//    void deleteById(Long id);

    void save(ContentDto contentDto);
    void update(Long id, ContentDto contentDto);
    void deleteById(Long id);
}
