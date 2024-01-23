package com.online.test_trail.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class IngredientDto {

    private Long id;
    private String ingredientName;
    private int ingredientQuantity;
    private double ingredientFraction;
    private String ingredientUnit;
}