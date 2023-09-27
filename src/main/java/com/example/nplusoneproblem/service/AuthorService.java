package com.example.nplusoneproblem.service;

import com.example.nplusoneproblem.model.Author;
import com.example.nplusoneproblem.model.Book;
import com.example.nplusoneproblem.model.dto.AuthorDTO;
import com.example.nplusoneproblem.model.mapper.AuthorMapper;
import com.example.nplusoneproblem.model.mapper.AuthorMapperClass;
import com.example.nplusoneproblem.repository.AuthorRepository;
import com.example.nplusoneproblem.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AuthorService {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public List<AuthorDTO> findAll() {
        List<Author> authors = authorRepository.findAll();
        return authors.stream()
                .map(AuthorMapperClass::authorToAuthorDTO)
                .collect(Collectors.toList());
    }

    public List<Book> findAllBooksOfAuthor(Author author){
        return bookRepository.findAllByAuthor(author);
    }
}

