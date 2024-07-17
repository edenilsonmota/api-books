package com.book.dto;


public record DataCreateBook(
    String name,
    String author,
    Integer quantity,
    String publisher,
    BookLanguage language,
    Integer pages,
    BookGenre genre,
    String isbn
) {}
