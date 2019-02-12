package com.bootcamp.game.dao;

import com.bootcamp.game.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
