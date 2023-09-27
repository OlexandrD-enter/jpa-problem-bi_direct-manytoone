package com.example.nplusoneproblem.model.mapper;


import com.example.nplusoneproblem.model.Book;
import com.example.nplusoneproblem.model.dto.BookDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookDTO bookToDTO(Book book);
    Book dtoToBook(BookDTO bookDTO);
}
