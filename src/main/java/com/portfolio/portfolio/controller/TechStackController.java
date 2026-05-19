package com.portfolio.portfolio.controller;

import com.portfolio.portfolio.domain.TechStack;
import com.portfolio.portfolio.service.TechStackService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/techstack")
public class TechStackController {

    private final TechStackService techStackService;

    @GetMapping
    public List<TechStack> findAll() {
        return techStackService.findAll();
    }
}