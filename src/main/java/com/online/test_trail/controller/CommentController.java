package com.online.test_trail.controller;

import com.online.test_trail.dto.CommentDto;
import com.online.test_trail.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/comment")
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;


    @PostMapping
    public String save(@RequestBody CommentDto commentDto) {
        commentService.save(commentDto);
        return "Data saved";
    }
}
