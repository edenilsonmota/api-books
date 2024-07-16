package com.livros.esm.livros.book;


public record DataCreateBook(
    String name,
    String author,
    Integer quantity,
    String publisher,
    BookLanguage language,
    Integer pages,
    BookGenre genre
) {}
