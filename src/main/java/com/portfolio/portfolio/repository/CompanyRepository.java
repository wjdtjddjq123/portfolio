package com.portfolio.portfolio.repository;

import com.portfolio.portfolio.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}