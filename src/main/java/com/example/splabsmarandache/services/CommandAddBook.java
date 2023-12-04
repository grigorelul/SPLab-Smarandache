package com.example.splabsmarandache.services;

import com.example.splabsmarandache.models.Book;

public class CommandAddBook implements Command<Book> {
    BooksService contextbooks;

    Book newBook;
    public CommandAddBook(BooksService contextbooks){
        this.contextbooks = contextbooks;
    }

    @Override
    public Book execute() {
        return contextbooks.createBook(newBook);
    }

    public void setAtribute(Book newBook){
        this.newBook = newBook;
    }
}
