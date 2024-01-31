package com.online.test_trail.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ingredients")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ingredientName", nullable = false)
    private String ingredientName;

    @Column(name = "ingredientQuantity", nullable = false)
    private String ingredientQuantity;

    @Column(name = "ingredientFraction")
    private String ingredientFraction;

    @Column(name = "ingredientUnit", nullable = false)
    private String ingredientUnit;

}
