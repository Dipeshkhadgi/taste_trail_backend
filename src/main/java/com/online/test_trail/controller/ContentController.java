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
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/content")
@RequiredArgsConstructor
public class ContentController {
    private final ContentService contentService;
    private final ApiResponse apiResponse;

    @GetMapping
    public ResponseEntity<Map<String, Object>> get(){
        return apiResponse.successResponse("Data fetch successfully",true,null,contentService.findAll());
    }

    @GetMapping("/byCategory/{category}")
    public List<Content> searchByCategory(@PathVariable("category") String category) {
        return this.contentService.searchByCategory(category);
    }


    @PostMapping("/save")
    public String createData(@RequestBody ContentDto contentDto){
        contentService.save(contentDto);
        return "created data";
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<Map<String, Object>> update(@PathVariable Long id, @Valid @RequestBody ContentDto contentDto) {
//        contentService.update(id, contentDto);
//        return apiResponse.successResponse("Data update successfully", true, null, null);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Map<String, Object>> delete(@PathVariable Long id) {
//        contentService.deleteById(id);
//        return apiResponse.successResponse("Data delete successfully", true, null, null);
//    }
    @GetMapping("/{id}")
    public Optional<Content> findById(@PathVariable("id") Long id) {
        return Optional.ofNullable(contentService.findById(id));
    }

}
