package com.online.test_trail.service;

import com.online.test_trail.dto.request.ContentDto;
import com.online.test_trail.entity.Content;

import java.util.List;

public interface ContentService {

    List<Content> findAll();
    void save(ContentDto contentDto);

}
