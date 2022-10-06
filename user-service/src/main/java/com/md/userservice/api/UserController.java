package com.md.userservice.api;

import com.md.userservice.client.BookClient;
import com.md.userservice.dto.BookDto;
import com.md.userservice.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/users")
public class UserController {

    private final BookClient bookClient;

    @GetMapping("{userId}")
    public ResponseEntity<UserDto> getUser(@PathVariable("userId") Long userId) {
        List<BookDto> books = bookClient.fetchBooks(userId).getBody();
        UserDto userDto = UserDto.builder()
                .userId(userId)
                .name("Great User")
                .books(books)
                .build();
        return new ResponseEntity<>(userDto, HttpStatus.OK);

    }
}
