package com.portfolio.portfolio.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CompanyDto {

    private String name;        // 예: 홍길동커뮤니케이션
    private String period;      // 예: 2020.03 ~ 2022.06
    private String description; // 업체 설명
}