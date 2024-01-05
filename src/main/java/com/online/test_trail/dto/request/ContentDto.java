package com.online.test_trail.dto.request;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ContentDto {

    private Integer id;

    private String recipeTitle;

    private String recipeDescription;

    private Integer preparationTimeHours;

    private Integer preparationTimeMinutes;


    private Integer recipeQuantityNumber;


    private String recipeQuantityType;


    private String categoryType;


    private String stepDescription;

    private String usedIngredients;

    private String recipePhoto;


    private String gatheredIngredients;
}
