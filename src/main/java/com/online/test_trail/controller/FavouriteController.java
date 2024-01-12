package com.online.test_trail.controller;

import com.online.test_trail.dto.FavouriteDto;
import com.online.test_trail.service.FavouriteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/favourite")
@RequiredArgsConstructor
public class FavouriteController {

    private final FavouriteService favouriteService;


    @PostMapping
    public String save(@RequestBody FavouriteDto favouriteDto) {
        favouriteService.save(favouriteDto);
        return "Data saved";
    }
}
