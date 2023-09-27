package com.example.nplusoneproblem.model.mapper;

import com.example.nplusoneproblem.model.Author;
import com.example.nplusoneproblem.model.dto.AuthorDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorMapper {
    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    @Mapping(source = "books", target = "books")
    AuthorDTO authorToAuthorDTO(Author author);
}
