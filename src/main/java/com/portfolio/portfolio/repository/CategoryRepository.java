package com.portfolio.portfolio.repository;

import com.portfolio.portfolio.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}