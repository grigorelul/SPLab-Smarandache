package com.example.splabsmarandache.services;

import com.example.splabsmarandache.models.Book;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CommandDeleteBook implements Command {

    private final Long id;
    private Book book;


    public void execute(CommandContext commandContext) {
        book = commandContext.getBooksService().deleteBook(id);
    }

    public Book getResultDeleteBook()
    {
        return book;
    }
}
