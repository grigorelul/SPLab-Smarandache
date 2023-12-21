package com.example.splabsmarandache.services;

import com.example.splabsmarandache.entitys.Author;
import com.example.splabsmarandache.entitys.Book;
import com.example.splabsmarandache.persistence.AuthorRepository;
import com.example.splabsmarandache.persistence.BooksRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class CommandContext {
    @Getter
    final private BooksRepository booksRepository; //Colectia care contine cartile
    @Getter
    final private AuthorRepository authorRepository;

}
