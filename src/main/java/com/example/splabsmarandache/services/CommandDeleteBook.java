package com.example.splabsmarandache.services;

public class CommandDeleteBook implements Command<Void> {

    BooksService contextBooks;
    Long id;

    public CommandDeleteBook(BooksService contextBooks) {
        this.contextBooks = contextBooks;
    }

    @Override
    public Void execute() {
        contextBooks.deleteBook(id);
        return null;
    }

    public void setAtribute(Long id){
        this.id = id;
    }
}
