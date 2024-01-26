package com.online.test_trail.controller;

import com.online.test_trail.dto.CommentDto;
import com.online.test_trail.entity.Comment;
import com.online.test_trail.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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


    @GetMapping("/{content_id}")
    public List<Comment> getCommentByContentId(@PathVariable("content_id") Long content_id){
        return commentService.getCommentByContentId(content_id);
    }
}
