package com.online.test_trail.controller;


import com.online.test_trail.dto.ContentDto;
import com.online.test_trail.entity.Content;
import com.online.test_trail.service.ContentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/content")
@RequiredArgsConstructor
public class ContentController {
    private final ContentService contentService;


    @GetMapping
    public List<Content> findAll() {
        return this.contentService.findAll();
    }
    @GetMapping("/{title}")
    public List<Content> searchByTitle(@PathVariable("title") String title) {
        return this.contentService.searchByTitle(title);
    }


    @PostMapping
    public String save(@Valid @RequestBody ContentDto contentDto) {
        contentService.save(contentDto);
        return "Data saved Successfully";
    }

    @GetMapping("/{id}")
    public Optional<Content> findById(@PathVariable("id") Long id) {
        return contentService.findById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        contentService.deleteById(id);
        return "Data deleted successfully";
    }

}
