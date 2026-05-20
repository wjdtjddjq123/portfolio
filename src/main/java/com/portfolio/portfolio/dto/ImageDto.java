package com.portfolio.portfolio.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ImageDto {

    private String originalName;  // 원본 파일명
    private String storedUrl;     // S3 저장 URL
    private Long categoryId;      // 카테고리 ID
}