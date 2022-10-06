package com.md.userservice.client;

import com.md.userservice.dto.BookDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Component
@FeignClient("book-service")
public interface BookClient {

    @GetMapping("api/books?user=userId")
    ResponseEntity<List<BookDto>> fetchBooks(@RequestParam("userId") Long userId);
}
