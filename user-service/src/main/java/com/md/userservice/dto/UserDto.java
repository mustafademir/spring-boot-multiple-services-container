package com.md.userservice.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class UserDto {
    private Long userId;
    private String name;
    List<BookDto> books;
}
