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
    private String originalName;

    @Column(nullable = false)
    private String storedUrl;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Image(String originalName, String storedUrl, Category category) {
        this.originalName = originalName;
        this.storedUrl = storedUrl;
        this.category = category;
    }
}