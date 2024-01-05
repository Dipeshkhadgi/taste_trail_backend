package com.online.test_trail.controller;


import com.online.test_trail.dto.request.ContentDto;
import com.online.test_trail.service.ContentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/content")
@RequiredArgsConstructor
public class ContentController {
    private final ContentService contentService;


    @PostMapping
    public void save(@Valid @RequestBody ContentDto contentDto){
            contentService.save(contentDto);
    }
}
