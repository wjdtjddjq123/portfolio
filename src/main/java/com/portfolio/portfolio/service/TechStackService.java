package com.portfolio.portfolio.service;

import com.portfolio.portfolio.domain.TechStack;
import com.portfolio.portfolio.repository.TechStackRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TechStackService {

    private final TechStackRepository techStackRepository;

    public List<TechStack> findAll() {
        return techStackRepository.findAll();
    }
}