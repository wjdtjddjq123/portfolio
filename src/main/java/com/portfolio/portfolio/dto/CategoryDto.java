package com.portfolio.portfolio.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CategoryDto {

    private String name;        // 예: UIUX, WEB DESIGN
    private Long parentId;      // 상위 카테고리 ID (없으면 null)
    private Integer sortOrder;  // 정렬 순서
}