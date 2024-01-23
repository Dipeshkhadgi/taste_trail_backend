package com.online.test_trail.controller;

import com.online.test_trail.dto.IngredientDto;
import com.online.test_trail.entity.Content;
import com.online.test_trail.entity.Ingredient;
import com.online.test_trail.helper.ApiResponse;
import com.online.test_trail.service.IngredientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/ingredients")
@RequiredArgsConstructor
public class IngredientController {

    private final IngredientService ingredientService;
//    private final ApiResponse apiResponse;

//    @GetMapping
//    public ResponseEntity<Map<String, Object>> get(){
//        return apiResponse.successResponse("Data fetch successfully",true,null,ingredientService.findAll());
//    }

    @PostMapping("/save")
    public String createData(@RequestBody IngredientDto ingredientDto){
        ingredientService.save(ingredientDto);
        return "created data";
    }


    @GetMapping("/{id}")
    public Optional<Content> findById(@PathVariable("id") Long id) {
        return Optional.ofNullable(ingredientService.findById(id));
    }

    @GetMapping("/getAll")
    public List<Ingredient> getAllData() {
        return ingredientService.getAll();
    }



}
