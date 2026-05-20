package com.portfolio.portfolio.service;

import com.portfolio.portfolio.domain.Company;
import com.portfolio.portfolio.dto.CompanyDto;
import com.portfolio.portfolio.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;

    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    public Company save(CompanyDto dto) {
        Company company = new Company(dto.getName(), dto.getPeriod(), dto.getDescription());
        return companyRepository.save(company);
    }
}