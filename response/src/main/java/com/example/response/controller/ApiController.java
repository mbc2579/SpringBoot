package com.example.response.controller;

import com.example.response.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    // TEXT로 내려주는 방법 잘 사용하지 않음
    @GetMapping("/text")
    public String text(@RequestParam String account) {
        return account;
    }
    // JSON
    // request -> object mapper -> object -> method -> object -> object mapper -> json -> response
    @PostMapping("/json")
    public User json(@RequestBody User user) {
        return user;
    }

    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
