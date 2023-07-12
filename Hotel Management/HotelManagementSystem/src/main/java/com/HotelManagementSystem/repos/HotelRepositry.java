package com.HotelManagementSystem.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepositry<Recipe> extends JpaRepository<Recipe, Long> {
    // custom query methods if needed
}

