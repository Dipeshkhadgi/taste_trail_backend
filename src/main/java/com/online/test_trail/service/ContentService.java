package com.online.test_trail.service;

import com.online.test_trail.dto.ContentDto;
import com.online.test_trail.entity.Content;

import java.util.List;
import java.util.Optional;

public interface ContentService {

    List<Content> findAll();
<<<<<<< HEAD
    Content findById(Long id);
    List<Content> searchByTitle(String title);
=======
>>>>>>> d97faaa2f3b02378d080cee6e0ccdf8a11d08eb8
    List<Content> searchByCategory(String category);

//    Optional<Content> findById(Long id);

//    void deleteById(Long id);

    void save(ContentDto contentDto);
    void update(Long id, ContentDto contentDto);
    void deleteById(Long id);
}
