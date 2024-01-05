package com.online.test_trail.repo;

import com.online.test_trail.entity.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentRepo extends JpaRepository<Content,Integer> {

}
