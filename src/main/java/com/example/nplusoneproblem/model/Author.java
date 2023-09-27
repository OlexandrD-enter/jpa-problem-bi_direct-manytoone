package com.example.nplusoneproblem.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    //@ToString.Exclude
    @OneToMany(mappedBy = "author")
    //@JsonManagedReference
    private List<Book> books;
}
