package com.example.retos_3_4_5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.retos_3_4_5.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
