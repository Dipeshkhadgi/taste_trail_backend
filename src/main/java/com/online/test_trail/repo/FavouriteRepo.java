package com.online.test_trail.repo;

import com.online.test_trail.entity.Favourite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FavouriteRepo extends JpaRepository<Favourite, Long> {
}
