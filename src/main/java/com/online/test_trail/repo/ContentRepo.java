package com.online.test_trail.repo;

import com.online.test_trail.entity.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContentRepo extends JpaRepository<Content, Long> {

    @Query(value = "select * from content where recipe_title like '%?1%'", nativeQuery = true)
    List<Content> searchByRecipeTitle(String recipeTitle);

    @Query(value = "select * from content where category_type=?1", nativeQuery = true)
    List<Content> searchByCategory(String category);

}
