package com.portfolio.portfolio.repository;

import com.portfolio.portfolio.domain.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}