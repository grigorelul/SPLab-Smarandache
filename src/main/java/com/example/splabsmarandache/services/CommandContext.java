package com.example.splabsmarandache.services;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class CommandContext {
    @Getter
    final private  BooksService booksService; //Colectia care contine cartile

}
