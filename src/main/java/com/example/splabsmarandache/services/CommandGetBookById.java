package com.example.splabsmarandache.services;

import com.example.splabsmarandache.models.Book;

import java.util.List;

public class CommandGetBookById implements Command<Book> {
    BooksService contextBooks;
    Long id;

    public CommandGetBookById(BooksService contextBooks)
    {
        this.contextBooks = contextBooks;
    }
    @Override
    public Book execute() {
        return contextBooks.getBookById(id);
    }

    public void setId(Long id) {
        this.id = id;
    }
}
