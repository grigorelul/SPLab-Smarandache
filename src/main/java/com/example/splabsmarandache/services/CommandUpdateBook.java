package com.example.splabsmarandache.services;

import com.example.splabsmarandache.models.Book;

import java.util.List;

public class CommandUpdateBook implements Command<Book>{

    BooksService contextBooks;
    Long id;
    Book newBook;
    public CommandUpdateBook(BooksService contextBooks){
        this.contextBooks = contextBooks;
    }

    public void setAtribute(Long id, Book newBook){
        this.id = id;
        this.newBook = newBook;
    }

    @Override
    public Book execute() {
        contextBooks.updateBook(id,newBook);
        return contextBooks.getBookById(id);
    }
}
