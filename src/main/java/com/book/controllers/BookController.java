package com.book.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.book.dto.DataCreateBook;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    public void create(@RequestBody DataCreateBook data){
        System.out.println(data);
    }
}
