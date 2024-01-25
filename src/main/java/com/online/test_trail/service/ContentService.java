package com.online.test_trail.service;

import java.util.List;

import com.online.test_trail.dto.ContentDto;
import com.online.test_trail.entity.Content;

public interface ContentService {

    List<Content> findAll();
    Content findById(Long id);
    List<Content> searchByTitle(String title);

    List<Content> searchByCategory(String category);

    void save(ContentDto contentDto);
    void update(Long id, ContentDto contentDto);
    void deleteById(Long id);
}
