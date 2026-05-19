package com.portfolio.portfolio.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "TECH_STACK")
public class TechStack {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String name;        // 예: 포토샵, 일러스트

    @Column(nullable = false)
    private String type;        // 예: 디자인툴, 개발툴
}