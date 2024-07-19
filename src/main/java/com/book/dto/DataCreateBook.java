package com.book.dto;

import com.book.enums.BookGenre;
import com.book.enums.BookLanguage;

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
