package com.example.nplusoneproblem.model.dto;

import lombok.*;

import java.util.List;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDTO {
    private Long id;
    private String name;
    private List<BookDTO> books;
}
