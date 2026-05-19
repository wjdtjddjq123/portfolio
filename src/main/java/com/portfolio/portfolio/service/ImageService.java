package com.portfolio.portfolio.service;

import com.portfolio.portfolio.domain.Image;
import com.portfolio.portfolio.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ImageService {

    private final ImageRepository imageRepository;

    public List<Image> findAll() {
        return imageRepository.findAll();
    }
}