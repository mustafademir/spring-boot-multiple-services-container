package com.md.bookservice.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookDto {
    private Long id;
    private String bookName;
    private Long userId;
}
