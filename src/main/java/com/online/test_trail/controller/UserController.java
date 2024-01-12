package com.online.test_trail.controller;


import com.online.test_trail.dto.UserDto;
import com.online.test_trail.entity.UserEntity;
import com.online.test_trail.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


    @GetMapping
    public List<UserEntity> findAll() {
        return this.userService.findAll();
    }


    @PostMapping
    public String save(@Valid @RequestBody UserDto userDto) {
        userService.save(userDto);
        return "Data saved Successfully";
    }

    @GetMapping("/{id}")
    public Optional<UserEntity> findById(@PathVariable("id") Integer id) {
        return userService.findById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable("id") Integer id) {
        userService.deleteById(id);
        return "Data deleted successfully";
    }
}
