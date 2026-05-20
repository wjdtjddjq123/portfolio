package com.portfolio.portfolio.service;

import com.portfolio.portfolio.domain.Category;
import com.portfolio.portfolio.domain.Image;
import com.portfolio.portfolio.dto.ImageDto;
import com.portfolio.portfolio.repository.CategoryRepository;
import com.portfolio.portfolio.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ImageService {

    private final ImageRepository imageRepository;
    private final CategoryRepository categoryRepository;

    public List<Image> findAll() {
        return imageRepository.findAll();
    }

    public Image save(ImageDto dto) {
        Category category = categoryRepository.findById(dto.getCategoryId()).orElse(null);
        Image image = new Image(dto.getOriginalName(), dto.getStoredUrl(), category);
        return imageRepository.save(image);
    }
}