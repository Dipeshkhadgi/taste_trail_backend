package com.online.test_trail.controller;


//import com.online.test_trail.dto.request.ContentDto;
//import com.online.test_trail.helper.ApiResponse;
//import com.online.test_trail.service.ContentService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//import java.util.Map;
import com.online.test_trail.dto.ContentDto;
import com.online.test_trail.entity.Content;
import com.online.test_trail.helper.ApiResponse;
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
    private final ApiResponse apiResponse;


//    @GetMapping
//    public ResponseEntity<Map<String ,Object>> get(){
//        return apiResponse.successResponse("Data fetch successfully",true,null,contentService.findAll());
//    }
//    @PostMapping
//    public ResponseEntity<Map<String, Object>> save(@Valid @RequestBody ContentDto contentDto) {
//        contentService.save(contentDto);
//        return apiResponse.successResponse("Data save successfully",true,null, null);
    public List<Content> findAll() {
        return this.contentService.findAll();
    }
//    @GetMapping("/{title}")
//    public List<Content> searchByTitle(@PathVariable("title") String title) {
//        return this.contentService.searchByTitle(title);
//    }


    @PostMapping("/save")
    public String createData(@RequestBody ContentDto contentDto){
        contentService.save(contentDto);
        return "created data";
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
