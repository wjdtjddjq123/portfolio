package com.portfolio.portfolio.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "CATEGORY")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String name;        // 예: UIUX, WEB DESIGN

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Category parent;    // 상위 카테고리 (null이면 최상위)

    private Integer sortOrder;  // 정렬 순서
}