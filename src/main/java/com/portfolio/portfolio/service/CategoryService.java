package com.portfolio.portfolio.service;

import com.portfolio.portfolio.domain.Category;
import com.portfolio.portfolio.dto.CategoryDto;
import com.portfolio.portfolio.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category save(CategoryDto dto) {
        Category parent = null;
        if (dto.getParentId() != null) {
            parent = categoryRepository.findById(dto.getParentId()).orElse(null);
        }
        Category category = new Category(dto.getName(), parent, dto.getSortOrder());
        return categoryRepository.save(category);
    }
}