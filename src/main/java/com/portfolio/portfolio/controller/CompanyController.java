package com.portfolio.portfolio.controller;

import com.portfolio.portfolio.domain.Company;
import com.portfolio.portfolio.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/company")
public class CompanyController {

    private final CompanyService companyService;

    @GetMapping
    public List<Company> findAll() {
        return companyService.findAll();
    }
}