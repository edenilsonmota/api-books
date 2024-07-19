package com.book.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.book.dto.DataCreateBook;
import com.book.entity.Book;
import com.book.repository.BookRepository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/books")
public class BookController {


    @Autowired
    private BookRepository repository;

    @PostMapping
    public void create(@RequestBody DataCreateBook data){
        repository.save(new Book(data));
    }
}
