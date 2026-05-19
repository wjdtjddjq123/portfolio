package com.portfolio.portfolio.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "IMAGE")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String originalName;  // 원본 파일명

    @Column(nullable = false)
    private String storedUrl;     // S3 저장 URL

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;    // 어떤 카테고리의 이미지인지
}