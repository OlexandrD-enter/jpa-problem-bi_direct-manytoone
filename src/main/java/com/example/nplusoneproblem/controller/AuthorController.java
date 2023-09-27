package com.example.nplusoneproblem.controller;

import com.example.nplusoneproblem.model.Book;
import com.example.nplusoneproblem.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping()
    public ResponseEntity<?> getAllAuthors() {
        return ResponseEntity.ok(authorService.findAll());
    }
}
