package com.portfolio.portfolio.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "COMPANY")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String name;        // 예: 홍길동커뮤니케이션

    private String period;      // 예: 2020.03 ~ 2022.06

    private String description; // 업체 설명
}