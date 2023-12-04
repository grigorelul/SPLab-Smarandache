package com.example.splabsmarandache.services;

import com.example.splabsmarandache.models.Book;
import org.springframework.stereotype.Component;

import java.util.List;

public class CommandGetAllBooks implements Command<List<Book>>{
    BooksService contextBooks;
    public CommandGetAllBooks(BooksService contextBooks){
        this.contextBooks=contextBooks;
    }
    public List<Book> execute() {
        return contextBooks.getBooks();
    }
}
