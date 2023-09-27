package com.example.nplusoneproblem.repository;

import com.example.nplusoneproblem.model.Author;
import com.example.nplusoneproblem.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findAllByAuthor(Author author);

    //@Query("SELECT b from Book b join fetch b.author")
    List<Book> findAll();
}
