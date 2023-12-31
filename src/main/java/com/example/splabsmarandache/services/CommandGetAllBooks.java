package com.example.splabsmarandache.services;

import com.example.splabsmarandache.entitys.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class CommandGetAllBooks implements Command{
    private List<Book> bookList = null;
    //commandContext contine colectia de carti
    public void execute(CommandContext commandContext) {
        bookList = commandContext.getBookCrudRepositoryAdapter().findAll();
    }

    public List<Book> getResultAllBooks (){
        return bookList;
    }
}
