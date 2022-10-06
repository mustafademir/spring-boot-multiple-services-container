package com.md.bookservice.api;

import com.md.bookservice.dto.BookDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/books")
public class BookController {

    @GetMapping()
    public ResponseEntity<List<BookDto>> getUserRelatedBooks(@RequestParam("userId") Long userId) {
        return new ResponseEntity<>(Collections.singletonList(generateBook(userId)), HttpStatus.OK);
    }

    private BookDto generateBook(Long userId) {
        return BookDto.builder()
                .bookName("Limitless")
                .id(1L)
                .userId(userId)
                .build();
    }
}
