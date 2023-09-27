package com.example.nplusoneproblem.model.mapper;

import com.example.nplusoneproblem.model.Author;
import com.example.nplusoneproblem.model.Book;
import com.example.nplusoneproblem.model.dto.AuthorDTO;
import com.example.nplusoneproblem.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//custom mapper
public class AuthorMapperClass {

    public static AuthorDTO authorToAuthorDTO(Author author) {
        if ( author == null ) {
            return null;
        }

        AuthorDTO authorDTO = new AuthorDTO();

        authorDTO.setBooks( bookListToBookDTOList( author.getBooks() ) );
        authorDTO.setId( author.getId() );
        authorDTO.setName( author.getName() );

        return authorDTO;
    }

    private static BookDTO bookToBookDTO(Book book) {
        if ( book == null ) {
            return null;
        }

        BookDTO bookDTO = new BookDTO();

        bookDTO.setId( book.getId() );
        bookDTO.setTitle( book.getTitle() );
        //bookDTO.setAuthor(authorToAuthorDTO(book.getAuthor())); author = null
        return bookDTO;
    }

    private static List<BookDTO> bookListToBookDTOList(List<Book> list) {
        if ( list == null ) {
            return null;
        }

        List<BookDTO> list1 = new ArrayList<BookDTO>( list.size() );
        for ( Book book : list ) {
            list1.add( bookToBookDTO( book ) );
        }

        return list1;
    }
}
