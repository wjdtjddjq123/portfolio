package com.portfolio.portfolio.repository;

import com.portfolio.portfolio.domain.TechStack;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechStackRepository extends JpaRepository<TechStack, Long> {
}