package com.portfolio.portfolio.controller;

import com.portfolio.portfolio.domain.Image;
import com.portfolio.portfolio.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/image")
public class ImageController {

    private final ImageService imageService;

    @GetMapping
    public List<Image> findAll() {
        return imageService.findAll();
    }
}